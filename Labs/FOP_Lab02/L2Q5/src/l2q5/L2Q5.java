/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;

/**
 *
 * @author mingl
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Random r = new Random () ;
       int randomvalue = r.nextInt(10001);
        System.out.println(randomvalue);
      int sum = 0;
      for(int ct = 10;ct< 10001;ct=ct * 10){
        int temp = randomvalue % ct/(ct/10);
         
          sum =  sum + temp;}
          System.out.println("The sum of the digits is " + sum);
          
    }
       
        
        
       
       
    }
    
}
