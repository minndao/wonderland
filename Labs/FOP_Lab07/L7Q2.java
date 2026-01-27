import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class L7Q2 {
    public static void main (String[] args){
        try {
 URL u = new URL("http://www.fsktm.um.edu.my");
 URLConnection cnn = u.openConnection();
 InputStream stream = cnn.getInputStream();
 Scanner in = new Scanner(stream);
    PrintWriter out = new PrintWriter(new FileOutputStream("index.htm"));

    while(in.hasNextLine()){
        String line = in.nextLine();
        out.println(line);
 }

 in.close();
    out.close();

} catch (IOException e) {
 System.out.println("IO Error:" + e.getMessage());
 }
    }
}
