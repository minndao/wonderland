
package Lab_08.L8Q7.src;

 class Money {
    private int amount; //in cents
    
    public Money (double amount){
        System.out.printf("Raw amount: %.2f\n\n",amount);
        this.amount = (int) (amount*100);
        this.amount = round(this.amount);
    }

    private int round(int amount) //in cents
    {
        int last = amount % 10;
        int base = amount / 10 * 10;

        if (last == 0 || last == 1 || last == 2 ) {return base;}
        else if (last == 3 || last == 4 || last == 5 || last == 6 || last == 7){return base+5;}
        else {return base + 10;}

    }

    public void displayNotesCoins(){
        int temp = this.amount;

        System.out.printf("Rounded amount: RM%.2f\n",(amount/100.0));

        int[] values = {10000, 5000, 2000, 1000, 500, 100, 50, 20, 10, 5, 1};
        String[] labels = {"RM100", "RM50 ", "RM20", "RM10 ", "RM5  ", "RM1  ", "50 sen", "20 sen", "10 sen", "5 sen ", "1 sen"};

        for (int i = 0; i < values.length; i++){
            int count = temp/values[i];
            if (count > 0){
                System.out.println(labels[i]+" x"+count);
                temp = temp % values[i];
            }
        }System.out.println();
    }

    public Money addition(Money x ){
       int sum = this.amount + x.amount;
       return new Money(sum/100.0);
    }

    public Money subtraction(Money x){
        int diff = this.amount - x.amount;
        return new Money(diff/100.0);
    }

}
