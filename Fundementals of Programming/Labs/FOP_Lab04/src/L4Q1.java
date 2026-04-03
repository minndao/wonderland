
package FOP_Lab04.src;

import java.util.Scanner;

 class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("The factors are: ");

        for (int i = 1; i<= number ;i++){
            if (number % i == 0){
            System.out.print(i + ",");}
           
            
            }
        
input.close();
        } 
    }

