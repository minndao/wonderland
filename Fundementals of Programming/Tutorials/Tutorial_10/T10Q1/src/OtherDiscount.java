package Tutorial_10.T10Q1.src;

public class OtherDiscount extends DiscountPolicy {

    

    @Override 
    public double computeDiscount(int count, double itemCost) {
        if (count >= 0 && count <= 2) return 0.0 * count * itemCost;
        else if (count >= 3 && count <= 5) return 0.1 * count * itemCost;
        else if (count >= 6 && count <= 10) return 0.2 * count * itemCost;
        else return 0.3 * count * itemCost;
    }
}