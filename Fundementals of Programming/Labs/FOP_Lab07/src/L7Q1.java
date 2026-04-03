
package FOP_Lab07.src;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.util.Scanner;

 class L7Q1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void write (){
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
                output.writeUTF("WXES1116/Programming I");
                output.writeUTF("WXES1115/Data Structure");
                output.writeUTF("WXES1110/Operating System");
                output.writeUTF("WXES1112/Computing Mathematiscs I");
                System.out.println("Data written to the file successfully.");
                    output.close();
                
        } catch (IOException e){
            System.out.println("Error while writing to the file");
        }
        }

 static void read (String enteredCode){
     boolean found = false;
     try{
         ObjectInputStream input = new ObjectInputStream(new FileInputStream("coursename.dat"));
         while (true){
            String courseName = input.readUTF();
            String[] formatted = courseName.split("/");
            String code = formatted[0];
            String name= formatted[1];

            if (code.equalsIgnoreCase(enteredCode)){
                System.out.println("Course found: " + name);
                found = true;
                input.close();
                break;
            }
         }
     }catch (FileNotFoundException e){
        System.out.println("File not found");
     }catch  (IOException e){
        System.out.println("Error while reading the file");
     }

     if (! found){
        System.out.println("Course code not found.");}
        
     }

    @SuppressWarnings("ConvertToTryWithResources")
     public static void main (String[] args){
        write();
        Scanner input = new Scanner (System.in);
        System.out.print("Enter course code to search: ");
        String code = input.next();
        read (code);
        input.close();
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
    
