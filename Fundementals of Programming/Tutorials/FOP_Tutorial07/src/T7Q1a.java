package FOP_Tutorial07.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class T7Q1a {
    public static void main(String[] args) {
        Random random = new Random();

        try (PrintWriter output = new PrintWriter(new FileOutputStream("integer.txt"))) {
            for (int i = 0; i < 10; i++) {
                output.println(random.nextInt(1001));
            }
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error with the file output");
        }
    }
}