
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new FileInputStream("Lab07/order.txt"));
            PrintWriter output = new PrintWriter (new FileOutputStream ("reversed.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                StringBuilder reverseBuilder = new StringBuilder(line);
                output.println(reverseBuilder.reverse().toString());
            }
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println("Error occured: " + e.getMessage());
        }

    }
}
