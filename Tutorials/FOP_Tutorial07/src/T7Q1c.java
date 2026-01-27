import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.io.IOException;

public class T7Q1c {
    public static void main(String[] args) {
        
    
    try {
        ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("integer.dat"));
        Random rd = new Random();
        for (int i = 0; i < 10 ; i ++){
            output.writeInt(rd.nextInt(1001));
        }
        output.close();
        System.out.println("Success");
    }
    catch (IOException e){
        System.out.println("Error with the file output");
    }}
}