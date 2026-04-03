
package Lab_08.L8Q6.src;

 class CrappyPatty {
    private String ID;
    private int dailySales;
    private static int totalSales;

    CrappyPatty(){
        this.ID = null;
        this.dailySales = 0;
        totalSales = totalSales + dailySales;
        System.out.println("Stall ID: " + ID + "\nDaily sales: " + dailySales);
        System.out.println();
    }

    CrappyPatty(String ID, int dailySales){
        this.ID = ID;
        this.dailySales = dailySales;
        totalSales = totalSales + this.dailySales;
        System.out.println("Stall ID: " + ID + "\nDaily sales: " + dailySales);
        System.out.println();
    }

    public void increment(int increment){
        this.dailySales = dailySales + increment;
        totalSales = totalSales + increment;
        System.out.println("Daily sales: " + dailySales);
        System.out.println();
    }

    public int getTotalSales(){
        return totalSales;
    }

    public void displaySpecific(){
        System.out.println("Total buger sold by outlet " + ID+ ": " + dailySales);
        System.out.println();    }

    public void displayTotal(){
        System.out.println("Total buger sold by all outlets: " + totalSales);
        System.out.println();    }
}
