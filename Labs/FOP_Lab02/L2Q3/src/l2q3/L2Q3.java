/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

import java.util.Random;

/**
 *
 * @author mingl
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int sum =0;
        for (int ct = 0;ct<3;ct++  ){
            int randomvalue= r.nextInt(41)+10;
            System.out.println(randomvalue);
            
       sum = sum + randomvalue;            
        }
        System.out.println("The sum of the numbers is "+ sum+".");
       double ans = sum/3;
        
        System.out.printf("The average of the sum is %.2f.", ans);
        
    }
    
}
