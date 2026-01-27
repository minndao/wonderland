import java.io.*;
import java.util.Scanner;

public class T7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        try {
            PrintWriter w = new PrintWriter (new FileOutputStream("secret.txt"));
            String asciiString = "";
            for (int i = 0; i < sentence.length(); i ++){
                char letter = sentence.charAt(i);
                asciiString += String.format("%d ", Integer.parseInt(Integer.toBinaryString(letter)));
            }
             w.print(asciiString);
                w.close();
        } catch (IOException e){
            System.out.println("Error with the file output");
        }

        try {
            Scanner sc = new Scanner (new FileInputStream("secret.txt"));

            int code = 0;
            String num = "";

            while (sc.hasNext()) {
                num += sc.next();
            }
            System.out.println(num);
            String whole = "";
                for (int i = 0; i < num.length(); i += 8){
                    code =0;
                   for (int j =  i, z= 7; j<i+8; j++, z--){
                    code+=Integer.parseInt(String.valueOf(num.charAt(j))) * Math.pow(2, z);
                   }
                   char print = (char) code;
                   whole += print;
                }
                System.out.println(whole);

        } catch (IOException e) {
            System.out.println("Error with the file input");
        }
    }
}
