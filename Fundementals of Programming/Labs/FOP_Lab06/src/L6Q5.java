
package FOP_Lab06.src;

import java.util.Scanner;

 class L6Q5 {
    public static boolean multiply(int a, int b, int c){
       return (a * b == c);}

         public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
             int Score = 0;
            while (true){
                 System.out.println("Enter negative number to quit: ");
             int a = input.nextInt();
            int b = input.nextInt();
             int c = input.nextInt();
            if (a < 0 || b < 0 || c < 0){
            break;
         }
        
                if (multiply(a, b, c)){
                   Score++;
         }
        
         

    } input.close();
     System.out.println("Your score is " + Score);
         }
        }
