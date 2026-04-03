
package FOP_Lab07.src;

import java.io.FileNotFoundException;

import java.io.FileInputStream;

import java.util.Scanner;

 class L7Q4 {
    public static void main(String[] args) {
        int lineCount = 0, wordCount = 0, charCount =  0;
        try{
            Scanner input = new Scanner (new FileInputStream("Lab07/lecturer.txt"));
        
            while (input.hasNextLine()){
                String line = input.nextLine();
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                lineCount++;

             }input.close();

             System.out.println("Number of lines: " + lineCount);
             System.out.println("Number of words: " + wordCount);
             System.out.println("Number of characters: " + charCount);
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        } 
    }
}
