package Tutorial_09.T9Q4.src;

public class PurchaseSystem {
    String productCode;
    double unitPrice;
    int quantity;
    double totalPrice;

    PurchaseSystem(String x,double y, int z){
        productCode = x;
        unitPrice = y;
        quantity = z;
    }

    protected double computeTotalPrice(){
        totalPrice = unitPrice * quantity;
        return totalPrice;
    }

    protected void displayTotalPrice(){
        System.out.println("Total price: RM " + computeTotalPrice());
    }
}
