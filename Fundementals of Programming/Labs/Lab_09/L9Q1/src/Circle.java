
package Lab_09.L9Q1.src;

import java.util.Scanner;

 class Circle extends Shape {
    private double diameter;

    Circle() {
        super("Circle");
    }

    public void inputDiameter(Scanner input) {
       
       System.out.println("Enter the diameter: ");
      this.diameter = input.nextDouble();

       computeArea();
       computePerimeter();
    }

    public void computePerimeter() {
        setPerimeter(Math.PI * diameter); 
    }

    public void computeArea() {
        setArea(Math.PI * Math.pow(diameter/2, 2));
    }

}
