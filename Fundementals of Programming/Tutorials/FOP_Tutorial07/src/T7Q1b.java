package FOP_Tutorial07.src;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q1b {
    public static void main(String[] args) {
        Integer maximum = null;
        Integer minimum = null;

        try (Scanner inputStream = new Scanner(new FileInputStream("integer.txt"))) {
            while (inputStream.hasNextInt()) {
                int number = inputStream.nextInt();
                System.out.println(number);
                if (minimum == null || number < minimum) {
                    minimum = number;
                }
                if (maximum == null || number > maximum) {
                    maximum = number;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        if (minimum == null || maximum == null) {
            System.out.println("No integers found in file");
            return;
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}