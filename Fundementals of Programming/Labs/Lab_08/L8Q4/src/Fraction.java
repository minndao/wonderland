
package Lab_08.L8Q4.src;

import java.util.Scanner;

 class Fraction {
   private int numerator;
    private int denominator;
    
    Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    Fraction(int a, int b){
        this.numerator = a;
        this.denominator = b;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator(int a){
        this.numerator = a;
    }

    public void setDenominator(int b){
        this.denominator = b;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int a = input.nextInt();
        System.out.print("Enter the denominator: ");
        int b = input.nextInt();
        setNumerator(a);
        setDenominator(b);
        input.close();
        System.out.println("Fraction: " + this.numerator +"/" + this.denominator);
    }

    private int calcGCD (int a, int b){
        if (b == 0){
            return a;
        }

        return calcGCD(b,a%b);
    }

        public void displayLowest(){
        int a = getNumerator();
        int b = getDenominator();

        int gcd = calcGCD(a, b);

        a = a/gcd;
        b = b/gcd;

        if(b < 0 ){
            a = -a;
            b = -b;
        }

        System.out.println("Reduced fraction: " + a + "/" + b);
        System.out.println();

    }

}
