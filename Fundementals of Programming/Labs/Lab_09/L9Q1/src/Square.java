
package Lab_09.L9Q1.src;

import java.util.Scanner;

 class Square extends Shape {
    double sideLength;

    public Square() {
        super("Square");
    }

    public void inputSide(Scanner input) {
       
       System.out.println("Enter the side length: ");
      this.sideLength = input.nextDouble();

      computeArea();
      computePerimeter();

       
    }

    public void computePerimeter() {
        setPerimeter(sideLength * 4);
    }

    public void computeArea() {
        setArea(sideLength * sideLength);
    }
}
