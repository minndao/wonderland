import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
int sum= 0;
        for (int i = 1; i <= number; i++){
        
            for (int j = 1; j <= i; j++){
sum = sum + j;
            }
        }
        System.out.println("The sum is: " + sum);
            input.close();

    }
    
}
