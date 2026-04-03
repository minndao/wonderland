package FOP_Tutorial04.T4Q1.src;

import java.util.Scanner;

public class T4Q1d {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number.");
    int num = input.nextInt();
    int sum = 0;
    for(int i = 1; i <= num; i++){
        sum = sum + i;
        
    }
    System.out.println(sum);
input.close();

}

}