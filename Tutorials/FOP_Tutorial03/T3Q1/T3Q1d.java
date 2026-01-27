package T3Q1;

import java.util.Scanner;

public class T3Q1d {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the fisrt string.");
    
    String line1 = input.nextLine();
    System.out.println("Enter the second string.");
    String line2 = input.nextLine();

    if (line1.compareToIgnoreCase(line2) < 0) {
        System.out.println("1st :"+line1);
        System.out.println("2nd :"+line2);


        
    }else {
        System.out.println("1st :"+line2);
        System.out.println("2nd :"+line1);

    }

input.close();
    }

}