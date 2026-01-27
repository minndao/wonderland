package T3Q1;

import java.util.Scanner;

public class T3Q1e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 0 and 6.");
    int num = input.nextInt();
switch (num){
    case 0:
        System.out.println("Sunday!");break;
        case 1: System.out.println("Monday!");break;
        case 2: System.out.println("Tuesday!");break;
        case 3: System.out.println("Wednesday!");break;
        case 4: System.out.println("Thursday!");break;
        case 5: System.out.println("Friday!");break;
        case 6: System.out.println("Saturday!");break;
        default: System.out.println("Invalid input.");break;



} input.close();
    }
}