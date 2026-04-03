
package FOP_Lab03.src;

import java.util.Scanner;

 class L3Q1 {

  
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
      System.out.println("Enter the first integer.");
      int num1 = input.nextInt();
      System.out.println("Enter the second integer.");
      int num2 = input.nextInt();
      System.out.println("Enter the operator.");
      char o = input.next().charAt(0);
      int ans = 0;
      switch (o) {
         case '%':
            ans = num1 % num2;
         case '&':
         case '\'':
         case '(':
         case ')':
         case ',':
         case '.':
         default:
            break;
         case '*':
            ans = num1 * num2;
            break;
         case '+':
            ans = num1 + num2;
            break;
         case '-':
            ans = num1 - num2;
            break;
         case '/':
            ans = num1 / num2;
      }

      System.out.println(ans);
      input.close();
   }


}

