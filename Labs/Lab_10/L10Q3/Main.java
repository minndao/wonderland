package Labs.Lab_10.L10Q3;

public class Main {
    public static void main(String[] args) {
        ShuffleCipher s1 = new ShuffleCipher("Plain.txt", "Encoded.txt", 3);
        ShuffleCipher s2 = new ShuffleCipher("Encoded.txt", "Decoded.txt", 3);

        s1.initiateEncoding();
        s2.initiateDecoding();
    }
}
