/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial02;

import java.util.Scanner;

/**
 *
 * @author mingl
 */
public class Q6 {
    public static void main(String[] args) {
        double diameter;
    
        Scanner in = new Scanner (System.in);
           System.out.println("Enter diameter.");
        
        diameter=in.nextDouble();
        
        double circumference = diameter * Math.PI;
        
        System.out.printf("The circumference of the circle is %.3f" ,  circumference);
        
           
    }
}
