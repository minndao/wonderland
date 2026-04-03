/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FOP_Tutorial02.src.tutorial02;

import java.util.Scanner;

/**
 *
 * @author mingl
 */
public class Q7 {
    public static void main(String[] args) {
        
        System.out.println("Enter the value in inches.");
        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();
        double c = b * 0.0254;
        System.out.printf("The value in meters is %.2f",c);
        a.close();
        
    }
}
