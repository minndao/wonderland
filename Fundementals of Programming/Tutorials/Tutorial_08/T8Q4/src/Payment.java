package Tutorial_08.T8Q4.src;

public class Payment {



        public void method (double amount){
            System.out.println("\nPaid via cash: RM" + amount);
        }

        public void method(double amount, String chequeNumber){
            System.out.println("\nPaid via cheque: RM" + amount);
            System.out.println("Cheque number: " + chequeNumber);
        }

        public void method(double amount, String holderName, String cardType, String expirationDate, String validationCode){
            System.out.println("\nPaid via credit card: RM" + amount);
            System.out.println("Card holder name: " + holderName +"\nCard type: " + cardType +"\nExpiration date: " + expirationDate+"\nValidation code: " + validationCode);
        }
    
}
