
package FOP_Lab03.src;

 import java.util.Scanner;

 class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle.");
        double r = input.nextDouble();
        System.out.println("Enter the origin x-coordinate of the circle.");
        double x0 = input.nextDouble();
        System.out.println("Enter the origin y-coordinate of the circle."); 
        double y0 = input.nextDouble();
System.out.println("Enter the x-coordinate of a point.");
double x1 = input.nextDouble();
System.out.println("Enter the y-coordinate of a point.");
double y1 = input.nextDouble();

    if (r < Math.sqrt((x1 - x0)*(x1 - x0) + (y1 - y0)*(y1 - y0))) {
        System.out.println("The point is outside the circle.");
    } else if (r == Math.sqrt((x1 - x0)*(x1 - x0) + (y1 - y0)*(y1 - y0))) {
        System.out.println("The point is on the circle.");
    } else {
        System.out.println("The point is inside the circle.");
    }
    input.close();
}
}
