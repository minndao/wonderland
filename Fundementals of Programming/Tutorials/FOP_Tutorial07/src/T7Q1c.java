package FOP_Tutorial07.src;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.io.IOException;

public class T7Q1c {
    public static void main(String[] args) {
        Random rd = new Random();

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("integer.dat"))) {
            for (int i = 0; i < 10; i++) {
                output.writeInt(rd.nextInt(1001));
            }
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error with the file output");
        }
    }
}