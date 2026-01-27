import java.util.Random;

public class L3Q2 {
        
    
    public static void main(String[] args) {
Random rd = new Random();
int num = rd.nextInt(6) ;

if (num == 0) {
    System.out.println(num + " is zero.");
} else if (num == 1) {
    System.out.println(num + " is one.");
} else if (num == 2) {  
    System.out.println(num + " is two.");
} else if (num == 3) {  
    System.out.println(num + " is three.");
} else if (num == 4) {  
    System.out.println(num + " is four.");
                
    }else {  
    System.out.println(num + " is five.");
}


      }  }