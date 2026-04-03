package src;

import java.util.Scanner;

public class q5{
    
    public static void main (String[] args){

        System.out.print("Mode (C/D): ");

       Scanner sc = new Scanner (System.in);
       
         char mode = sc.nextLine().charAt(0);
            System.out.print("Text: ");
        String text = sc.nextLine();
        

        if (mode == 'C'){
            System.out.println("Compressed text: " + compress(text));
        }else if (mode == 'D'){
            System.out.println("Decompressed text: " + decompress(text));
}sc.close();
    }

public static String compress (String s){
    if (s.length() == 0){
        return "";
    }

    StringBuilder compressed = new StringBuilder();
    int ct = 1;
    for (int i =1; i < s.length(); i++){
        if (s.charAt(i) == s.charAt(i - 1)){
            ct++;
    }else {
        compressed.append(ct);
        compressed.append(s.charAt(i - 1));
        
        ct = 1;
    }
}
    compressed.append(ct);
    compressed.append(s.charAt(s.length() - 1));

return compressed.toString();
}

public static String decompress (String s){
    StringBuilder decompressed = new StringBuilder();

    if (s.isEmpty() || !Character.isDigit(s.charAt(0))){
        return "Invalid input";
    }
    
    int ct = 0;
    for (int i =0; i < s.length(); i++){
        if (Character.isDigit(s.charAt(i))){
            ct = ct * 10 + (s.charAt(i) - '0');
                }else {
                     for (int j =0; j < ct; j++){
                    decompressed.append(s.charAt(i));
                                                 }
        ct = 0;
                                            }
                                        }  
    return decompressed.toString();
} 
}
