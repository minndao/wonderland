package Tutorial_09.T9Q3.src;

public class SpecialPay extends PaySystem {
    SpecialPay(double payRate, int hours){
        super(payRate, hours);
    }
@Override
    public double calculateGivenHours(int hours){
        return super.calculateGivenHours(hours)*1.3;
    }
@Override
    public double totalPay(){
        return super.totalPay()*1.3;
    }

}
