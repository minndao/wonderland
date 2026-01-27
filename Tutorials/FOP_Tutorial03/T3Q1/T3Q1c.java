package T3Q1;
import java.util.Scanner;

public class T3Q1c{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the character.");
    char x = input.nextLine().charAt(0);
    
   
    if (x>= 'A' && x<= 'Z') {
        System.out.println(x +" is a capital letter.");
        
    }
        else {
        System.out.println(x +" is not a capital letter.");
        input.close();
        }
    }
}

    

