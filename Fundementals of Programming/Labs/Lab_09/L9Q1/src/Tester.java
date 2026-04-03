
package Lab_09.L9Q1.src;

import java.util.Scanner;

 class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        Circle c1 = new Circle();

        r1.acceptInput(input);
        s1.inputSide(input);
        c1.inputDiameter(input);

        r1.display();
        s1.display();
        c1.display();
    }
}
