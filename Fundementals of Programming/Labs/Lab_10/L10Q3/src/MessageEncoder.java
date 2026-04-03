package Lab_10.L10Q3.src;

public interface MessageEncoder {
    void initiateEncoding();
    void initiateDecoding();
    String encode(String plainText);
    String decode(String cipherText);

    
}
