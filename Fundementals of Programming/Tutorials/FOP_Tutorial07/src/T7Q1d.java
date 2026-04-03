package FOP_Tutorial07.src;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;


public class T7Q1d {
    public static void main(String[] args) {
        int total = 0;
        int ct = 0;

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("integer.dat"))) {
            System.out.println("Reading integers from the file...");

            while (true) {
                int number = input.readInt();
                total += number;
                ct++;
                System.out.println(number);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        if (ct == 0) {
            System.out.println("No integers found in file.");
            return;
        }

        double average = (double) total / ct;
        System.out.println("Average: " + average);
    }
}







