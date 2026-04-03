package Tutorial_09.T9Q3.src;

public class Main {
    public static void main(String[] args) {
        RegularPay Jordan = new RegularPay(7.5,8);
        SpecialPay Vincent = new SpecialPay(7.5, 8);

        System.out.println(Jordan.calculateGivenHours(8));
        System.out.println(Vincent.calculateGivenHours(8));

        Jordan.display();
        Vincent.display();
    }   
}
