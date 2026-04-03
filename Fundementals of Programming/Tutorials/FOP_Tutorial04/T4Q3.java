
package FOP_Tutorial04;

public class T4Q3 {
    public static void main(String[] args) {
        int pre1  = 1;
        int pre2 = 1;
        System.out.println("1\n1");
        for ( int i = 3 ; i <= 10; i++ ){
         
int next = pre1 + pre2;
System.out.println(next);
pre2 = pre1;
pre1 = next;


    
            
        }   
     }
}
