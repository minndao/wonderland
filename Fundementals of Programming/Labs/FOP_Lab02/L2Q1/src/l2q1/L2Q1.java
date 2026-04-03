/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FOP_Lab02.L2Q1.src.l2q1;

import java.util.Scanner;

/**
 *
 * @author mingl
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter the temperature in degree Farenheit.");    
        Scanner input = new Scanner (System.in);
        
        double celsius = (input.nextDouble()-32)/1.8;
        System.out.printf("The temperature in Celsius is %.2f",celsius);
        
                input.close();
        
    
    }
    
}
