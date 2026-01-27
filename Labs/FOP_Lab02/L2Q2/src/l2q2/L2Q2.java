/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

import java.util.Scanner;

/**
 *
 * @author mingl
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the price of the car.");
        Scanner input = new Scanner(System.in);  
        double P = input.nextDouble();
        
        System.out.println("Enter the down payment.");
       double D = input.nextDouble();
       
        System.out.println("Enter the interest rate in %.");
        double R = input.nextDouble();
        
        System.out.println("Enter the loan duaraion in year.");
        double Y = input.nextDouble();
        double M =(P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly payment for the car loan is RM%.2f%n.",M);
        
    }
    
}
