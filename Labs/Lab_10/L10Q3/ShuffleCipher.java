package Labs.Lab_10.L10Q3;

import Labs.Lab_10.L10Q2.MessageEncoder;
import java.io.*;

public class ShuffleCipher implements MessageEncoder {

    String inputFileName;
    String outputFileName;
    int N;

        ShuffleCipher(String inputFileName, String outputFileName, int N) {
            this.inputFileName = inputFileName;
            this.outputFileName = outputFileName;
            this.N = N;
        }

    public void initiateDecoding() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Labs/Lab_10/L10Q3//" + this.inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Labs/Lab_10/L10Q3//" + this.outputFileName));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            String processedLine = sb.toString();

            for (int i = 0; i < N; i++) {
                processedLine = decode(processedLine);
            }

            writer.write(processedLine);

            reader.close();
            writer.close();
           
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file.");
        }

        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
       
    public  void initiateEncoding() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Labs/Lab_10/L10Q3//" + this.inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Labs/Lab_10/L10Q3//" + this.outputFileName));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            String processedLine = sb.toString();

            for (int i = 0; i < N; i++) {
                processedLine = encode(processedLine);
            }

            writer.write(processedLine);

            reader.close();
            writer.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file.");
        }

        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String encode(String plainText) {
        StringBuilder sb = new StringBuilder();

        int mid = plainText.length()/2;

        String part1 = plainText.substring(0, mid);
        String part2 = plainText.substring(mid, plainText.length());


        for (int i = 0; i < mid; i++) {
            sb.append(part1.charAt(i));
            sb.append(part2.charAt(i));
        }

        if (part1.length() != part2.length()) {
            sb.append(part2.charAt(part2.length() - 1));
        }

        System.out.println(inputFileName + " is encoded and stored at " + outputFileName);
        return sb.toString();
    }

    @Override
    public String decode(String cipherText) {
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        for (int i = 0; i < cipherText.length()/2; i++) {
            part1.append(cipherText.charAt(i * 2));
            part2.append(cipherText.charAt(i * 2 + 1));
        }

         if (cipherText.length() % 2 != 0) {
            part2.append(cipherText.charAt(cipherText.length() - 1));
        }

        System.out.println(inputFileName + " is decoded and stored at " + outputFileName);
        return part1.toString() + part2.toString();
    
    }
}
