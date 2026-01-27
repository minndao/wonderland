package Tutorials.Tutorial_10.T10Q2;

public class SavingAccount implements Interest {

    private double balance;

    SavingAccount(double balance) {
        this.balance = balance;
    }

    
    public double computeInterest() {
        return balance * 0.5/100;
    }
    
}
