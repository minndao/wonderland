package Tutorial_09.T9Q2.src;

public class Animal extends Organism {
    double eatingAmount;

    Animal(){
        eatingAmount = 1;
    }

    public void displayEatingAmount(){
        System.out.println(eatingAmount);
    }
}
