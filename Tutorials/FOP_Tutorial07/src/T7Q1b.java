import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q1b {
    public static void main(String[] args) {

                    int maximum = 0;
                    int minimum = 1000;

        try {
            Scanner inputStream = new Scanner (new FileInputStream("integer.txt"));
            

            while (inputStream.hasNextInt()) {
                int number = inputStream.nextInt();
                System.out.println(number);
                if (number < minimum) {
                    minimum = number;
                }
                if (number > maximum) {
                    maximum = number;
                    
                }
            }

           


            inputStream.close();
    }catch (FileNotFoundException e){
        System.out.println("File not found");
    }
    System.out.println("Minimum: " + minimum);
    System.out.println("Maximum: " + maximum);
}}