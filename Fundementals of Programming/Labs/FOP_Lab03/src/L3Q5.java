
package FOP_Lab03.src;

import java.util.Scanner;

 class L3Q5 {
    public static void main(String[] args) {
        System.out.println("This program solves the following set of linear equations:");
        System.out.println("ax + by = e, cx + dy = f; x = (ed - bf)/(ad - bc), y = (af - ec)/(ad - bc)");
        double  x = 0, y = 0;
Scanner input = new Scanner(System.in);
System.out.println("Enter the value of a.");
double a = input.nextDouble();
System.out.println("Enter the value of b."); 
double b = input.nextDouble();  
System.out.println("Enter the value of c.");
double c = input.nextDouble();
 System.out.println("Enter the value of d.");
double d = input.nextDouble();
 System.out.println("Enter the value of e.");
double e = input.nextDouble();
 System.out.println("Enter the value of f.");
double f = input.nextDouble();

if ((a * d) - (b * c) == 0){
    System.out.println("The equation has no solution.");
} else {
    x = (((e*d) - b*f )/(a*d - b*c));
    y = ((a*f - e*c )/(a*f-b*c));
    System.out.printf("The solution is x = %.2f and y = %.2f.", x, y);
 
    }
    input.close();

}
}
