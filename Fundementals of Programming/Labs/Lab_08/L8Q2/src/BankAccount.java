
package Lab_08.L8Q2.src;

 class BankAccount {
    String name;
    String ID;
    double amount;

    BankAccount(){
        this.name = null;
        this.ID = null;
        this.amount = 0;
    }

    BankAccount(String name,String ID, double amount){
        this.name = name;
        this.ID = ID;
        this.amount = amount;
    }

    public void deposit(double amount){
        this.amount = this.amount + amount;
        System.out.println("Current balance: RM" + this.amount);
        System.out.println();
    }

    public void withdraws(double amount){
        if (this.amount - amount < 0) {
            System.out.println("Withdraw unsuccessfull: Current balance is insufficient.");
        }else{
            this.amount = this.amount - amount;
       
    }
     System.out.println("Current balance: RM" + this.amount);
    System.out.println();}

     public void displayCurrentBalance(){
        System.out.println("Name: "+ this.name);
        System.out.println("IC/Passport number: " + this.ID);
        System.out.println("Current balance: RM" + this.amount);
        System.out.println();

     }
    

    

  
    
}
