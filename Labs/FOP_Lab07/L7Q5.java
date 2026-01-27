import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.InputMap;

public class L7Q5 {
    public static void main(String[] args) {
        try{
        ObjectInputStream input = new ObjectInputStream (new FileInputStream ("Lab07/person.dat"));
        int TotalNumberofRecord = input.readInt();
            
        for (int i = 0; i < TotalNumberofRecord; i++){
            String name = input.readUTF();
            int age = input.nextInt();
            char gender = input.nextChar();

        }
    }}
}
