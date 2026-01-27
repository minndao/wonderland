package Labs.Lab_10.L10Q2;

public class Tester {
    public static void main(String[] args) {
        SubstitutionCipher substitutionCipher = new SubstitutionCipher("plainText.txt", "Encoded.txt", 3);
        SubstitutionCipher substitutionCipher2 = new SubstitutionCipher("cipherText.txt", "Decoded.txt", 3);

        substitutionCipher.performEncode();
        
        substitutionCipher2.performDecode();
    }
}
