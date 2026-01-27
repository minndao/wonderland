
import java.util.Scanner;

public class q1 {

    public static int digitalroot (int n){
       
        while (n >= 10) {
        int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            
        }
        n = sum;
    }
    return n;}
    

    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digital Root: " + digitalroot(n));
        sc.close();
    }
}
