
package Lab_10.L10Q2.src;

import java.io.*;

 class SubstitutionCipher implements MessageEncoder {
    private String inputFileName;
    private String outputFileName;
    private int shift;

    SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    public void performEncode() {
        readAndWrite(true);
    }

    public void performDecode() {
        readAndWrite(false);
    }

    public void readAndWrite(boolean isEncoding) {
        try{       
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\JackMa\\Md'sRepo\\wonderland\\Labs\\Lab_10\\L10Q2\\"+inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\JackMa\\Md'sRepo\\wonderland\\Labs\\Lab_10\\L10Q2\\"+outputFileName));

             String line;
             StringBuilder sb = new StringBuilder();
             String processedLine;

             while ((line = reader.readLine()) != null) {
                sb.append(line);
             }

             if (isEncoding) processedLine = encode(sb.toString());
             else processedLine = decode(sb.toString());

             writer.write(processedLine);
             writer.newLine();

             reader.close();
             writer.close();

                 

                if (isEncoding) System.out.println("Encoded output saved in " + outputFileName);
             else System.out.println("Decoded output saved in " + outputFileName);
            }
                   

        catch (FileNotFoundException e){

            System.out.println("Unable to locate the file.");
        }

        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String encode(String plainText) {
        
        StringBuilder sb = new StringBuilder();

                char [] chars = plainText.toCharArray();
                
                for (char c : chars) {
                    c += shift;
                    
                    sb.append(c);
                }

        return sb.toString();
    }

    @Override
    public String decode(String cipherText) {

        StringBuilder sb = new StringBuilder();

        char[] chars = cipherText.toCharArray();

        for (char c : chars) {
            c -= shift;
            sb.append(c);
        }
        
        return sb.toString();
    }

}
