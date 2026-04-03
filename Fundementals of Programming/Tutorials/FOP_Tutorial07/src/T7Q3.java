package FOP_Tutorial07.src;

import java.io.*;
import java.util.Scanner;

public class T7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        try (PrintWriter w = new PrintWriter(new FileOutputStream("secret.txt"))) {
            StringBuilder asciiString = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                char letter = sentence.charAt(i);
                String binary = String.format("%8s", Integer.toBinaryString(letter)).replace(' ', '0');
                asciiString.append(binary).append(" ");
            }
            w.print(asciiString);
        } catch (IOException e) {
            System.out.println("Error with the file output");
        }

        try (Scanner sc = new Scanner(new FileInputStream("secret.txt"))) {
            StringBuilder whole = new StringBuilder();
            while (sc.hasNext()) {
                String num = sc.next();
                int code = Integer.parseInt(num, 2);
                whole.append((char) code);
            }

            System.out.println(whole);
        } catch (IOException e) {
            System.out.println("Error with the file input");
        }
        input.close();
    }
}
