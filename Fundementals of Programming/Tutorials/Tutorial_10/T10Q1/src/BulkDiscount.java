package Tutorial_10.T10Q1.src;

public class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discountRate;

    BulkDiscount(int minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }

    @Override
    public double computeDiscount(int count, double itemCost ) {
        if (count > minimum) {
            return count * itemCost * (discountRate/100);
        }

        return 0;
    }

}