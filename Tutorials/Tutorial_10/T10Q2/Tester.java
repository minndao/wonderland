package Tutorials.Tutorial_10.T10Q2;

public class Tester {
    
    public static void main(String[] args) {
        
        Interest savingAccount = new SavingAccount(800);
        Interest fixedAccount = new FixedAccount(800);

        System.out.println(savingAccount.computeInterest());
        System.out.println(fixedAccount.computeInterest());

    }
}
