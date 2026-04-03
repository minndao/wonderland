package Tutorial_10.T10Q1.src;

public class Main {
    public static void main(String[] args) {
        int count = 10;
        double itemCost = 30.00;

        DiscountPolicy bulk = new BulkDiscount(7, 15);
        DiscountPolicy other = new OtherDiscount();
        DiscountPolicy combine = new CombineDiscount(bulk, other);

        System.out.println(bulk.computeDiscount(count, itemCost));
        System.out.println(other.computeDiscount(count, itemCost));
        System.out.println(combine.computeDiscount(count, itemCost));

        
    }
}
