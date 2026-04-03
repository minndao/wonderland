package FOP_Tutorial03.T3Q1.src;

import java.util.Scanner;

public class T3Q1b{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = input.nextInt();
    if ( num %2 == 0) {
        System.out.printf("%d is an even number.",num);
    }else{
        System.out.printf("%d is an odd number.",num);
    }
input.close();
        
    }
}

