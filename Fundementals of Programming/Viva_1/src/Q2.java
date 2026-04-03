package src;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Receive the number of inquiries
        int q ;
        
            q = sc.nextInt();
       
     if (q < 1 || q > 200) {
            System.out.println("The number of inquiries must be between 1 and 200.");
            sc.close();
            return;
        }
        int[] analyzeDigit = new int[q];
        int[] LuckyDigit = new int[q];

        // Store inputs
        for (int i = 0; i < q; i++) {
            analyzeDigit[i] = sc.nextInt();
            LuckyDigit[i] = sc.nextInt();

            if ( analyzeDigit[i] < 0 || analyzeDigit[i]    > 2000000000) {
            System.out.println("Analyze Digit must be between 0 and 2,000,000,000.");
            sc.close();
            return;
        }
         if ( LuckyDigit[i] < 0 || LuckyDigit[i] > 9) {
            System.out.println("Lucky Digit must be between 0 and 9.");
            sc.close();
            return; 
        }

        

        // Analyze each case
        for (int j = 0; j < q; j++) {
            int LuckyCount = 0;
            int ZeroCount = 0;
            int EvenCount = 0;
            int OddCount = 0;

            int num = analyzeDigit[i];
            int LuckyDigitValue = LuckyDigit[i];

            // Special rule: If N = 0, it has one digit '0'
            if (num == 0) {
                if (LuckyDigitValue == 0) LuckyCount++;
                else ZeroCount++;
            }

            // Process all digits
            while (num > 0) {
                int Digit = num % 10;

                // Apply category rules (Lucky has highest priority)
                if (Digit == LuckyDigitValue) {
                    LuckyCount++;
                } else if (Digit == 0 && LuckyDigitValue != 0) {
                    ZeroCount++;
                } else if (Digit % 2 == 0) {
                    EvenCount++;
                } else {
                    OddCount++;
                }

                num /= 10;
            }

            // Determine Signature
            if (LuckyCount > ZeroCount && LuckyCount > EvenCount && LuckyCount > OddCount) {
                System.out.println("LUCKY");
            } else if (EvenCount > LuckyCount && EvenCount > OddCount && EvenCount > ZeroCount) {
                System.out.println("BALANCED");
            } else if (OddCount > LuckyCount && OddCount > EvenCount && OddCount > ZeroCount) {
                System.out.println("ENERGETIC");
            } else {
                System.out.println("NEUTRAL");
            }
        }

        sc.close();
    }
}}
