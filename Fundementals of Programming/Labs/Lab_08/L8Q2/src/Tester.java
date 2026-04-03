
package Lab_08.L8Q2.src;

 class Tester {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount("Jordan","060204067459",778.98);

        user1.displayCurrentBalance();
        user2.displayCurrentBalance();

        user1.deposit(200);
        user2.deposit(5000);

        user1.withdraws(500);
        user2.withdraws(5000);
    }
}
