
package Lab_10.L10Q1.src;

 class Tester {
    public static void main(String[] args) {
        
        PermanentEmployee e1 = new PermanentEmployee("Jordan", "a");
        ContractStaff e2 = new ContractStaff("Alex", 888.88);
        TemporaryStaff e3 = new TemporaryStaff("Anson", 200);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
