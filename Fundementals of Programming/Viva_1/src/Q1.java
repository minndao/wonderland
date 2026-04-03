package src;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q;

        System.out.println("Please enter the number of inquiries:");
        q = input.nextInt();

        if (q < 1 || q > 500) {
            System.out.println("The number of inquiries must be between 1 and 500.");
            input.close();
            return;
        }

        for (int i = 1; i <= q; i++) {
            int a, b, n;
            System.out.printf(
                    "Please enter the %d queries in the format: [Initial Value] [Multiplier Seed] [Charm Length]\n",
                    i);
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();

            if (a < 0 || a > 50 || b < 0 || b > 50 || n < 1 || n > 15) {

                System.out.println(
                        "Invalid input. Ensure: 0 <= Initial Value, Multiplier Seed <= 50 and 1 <= Charm Length <= 15.");
                i--;
                continue;
            }
            int ans;

            for (int j = 1; j <= n; j++) {
                ans = (int) (a + (b * (Math.pow(2, j - 1))));
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        input.close();
    }
}


