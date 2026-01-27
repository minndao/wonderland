import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;


public class T7Q1d {
    public static void main(String[] args) {
        ObjectInputStream input = null;
        int total = 0, average, ct = 0;
        
      
        try {
             input = new ObjectInputStream(new FileInputStream("integer.dat"));

            System.out.println("Reading integers from the file...");

            while (true) { 
                int number = input.readInt();
                total += number;
                ct ++;
                System.out.println(number + " ");
            }
            }
        catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }  average = total / ct;
        System.out.println("Average: " + average);
    }
}
 

 


        

