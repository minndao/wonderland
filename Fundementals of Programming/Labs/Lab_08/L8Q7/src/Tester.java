
package Lab_08.L8Q7.src;

 class Tester {
    public static void main(String[] args) {
        Money stack1 = new Money(256.32);
        Money stack2 = new Money(788.40);
        Money stack3 = new Money(20.20);
        stack1.displayNotesCoins();
        stack2.displayNotesCoins();
        stack3.displayNotesCoins();

        stack1.addition(stack2);
        stack2.subtraction(stack3);
    }
}
