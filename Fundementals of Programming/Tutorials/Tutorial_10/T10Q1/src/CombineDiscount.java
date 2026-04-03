package Tutorial_10.T10Q1.src;

public class CombineDiscount extends DiscountPolicy {
    private DiscountPolicy p1;
    private DiscountPolicy p2;

    public CombineDiscount(DiscountPolicy p1, DiscountPolicy p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
       double discount1 = p1.computeDiscount(count, itemCost);
       double discount2 = p2.computeDiscount(count, itemCost);

       return Math.max(discount1, discount2);

        
    }
}
