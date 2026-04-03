/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package FOP_Lab02.L2Q6.src.l2q6;

import java.util.Scanner;

/**
 *
 * @author mingl
 */
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the amount of water in gram.");
        Scanner input = new Scanner (System.in);
        double M = input.nextInt()/1000;
        
     
         System.out.println("Enter the initial temperature in degree Farenheit.");    
      
        
        double initialcelsius = (input.nextDouble()-32)/1.8;
          System.out.println("Enter the final temperature in degree Farenheit.");    
      
        
        double finalcelsius = (input.nextDouble()-32)/1.8;
        
        double Q = M * (finalcelsius-initialcelsius)*4184;
   
        System.out.println("The energy needed to heat the water is " + Q +"J.");
        
        input.close();
        
        
    }
    
}
