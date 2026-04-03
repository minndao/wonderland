
package Lab_08.L8Q6.src;

 class Tester {
    public static void main(String[] args) {
        CrappyPatty crap1 = new CrappyPatty("0001",0);
        CrappyPatty crap2 = new CrappyPatty("0002",58);
        CrappyPatty crap3 = new CrappyPatty("0003",100);

        crap1.displayTotal();
        crap2.displaySpecific();
        crap1.increment(140);
        crap3.displayTotal();
    }
}
