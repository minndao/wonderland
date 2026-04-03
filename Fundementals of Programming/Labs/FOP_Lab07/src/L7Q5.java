
package FOP_Lab07.src;

import java.io.ObjectInputStream;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

 class L7Q5 {
    public static void main(String[] args) {
        try{
        ObjectInputStream input = new ObjectInputStream (new FileInputStream ("Lab07/person.dat"));
        int TotalNumberofRecord = input.readInt();
            
            String name = "";
            int age = 0;
            char gender = ' ';
            
            for (int i = 0; i < TotalNumberofRecord; i++){
                name = input.readUTF();
                age = input.readInt();
                gender = input.readChar();
    
            }

            System.out.println(name + age + gender);
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
