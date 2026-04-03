package Tutorial_09.T9Q4.src;

public class SugarPurchase extends PurchaseSystem {
    double weight;

    SugarPurchase(String x, double y, int z, double weight){
       super(x,y,z);
       this.weight = weight;
    }

    @Override
    protected double computeTotalPrice(){
        return super.computeTotalPrice() * weight;
    }
}
