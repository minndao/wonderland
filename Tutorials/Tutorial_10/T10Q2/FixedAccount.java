package Tutorials.Tutorial_10.T10Q2;

public class FixedAccount implements Interest {

    private double balance;

    FixedAccount(double balance) {
        this.balance = balance;
    }

    
    public double computeInterest() {
        return balance * 3/100;
    }
}
