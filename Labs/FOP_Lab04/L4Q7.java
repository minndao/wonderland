import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    double C = 0, L =0, R =0, M = 0, P = 0, i, totalL = 0;
int n, N = 0;
    System.out.print("Enter principal amount: ");
    P = input.nextDouble();
    double unpaid =      P;
            System.out.print("Enter interest in %: ");
            i = input.nextDouble();
    
            System.out.print("Enter total number of month(s): ");
            N = input.nextInt();

for ( int j = 0 ; j < N ; j++){
    n = j + 1;
    M = (P * (i/1200)) / (1 -  Math.pow(1 + (i/1200), -N));
    C = M * Math.pow((1 + i/1200), -(1 + N - n));
    L = M - C;
    R = L * (i/1200) - C;
    unpaid = unpaid + R;


    
    totalL += L;

    System.out.printf("Month %d: Monthly Payment = %.2f, Principal = %.2f, Interest = %.2f Unpaid Balance = %.2f, Total Interest = %.2f\n", n, M, Math.abs(R), L, unpaid, totalL);  









            input.close();



    }
}}
