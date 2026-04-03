/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package FOP_Lab02.L2Q4.src.l2q4;

import java.util.Scanner;

/**
 *
 * @author mingl
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter the number in second.");
       Scanner input = new Scanner (System.in);
       int s = input.nextInt();
       int h = s/3600;
       int m = (s%3600)/60;
       s = s % 60;
       
        System.out.println(h +" hours, "+ m  +" minutes and "+s +" seconds." );
        input.close();
       
            
        
        
        
        
        
        
    }
    
}
