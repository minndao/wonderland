package Tutorial_08.T8Q2.src;

public class Digit {

    int number;

    public Digit(int number){
        this.number = number;
    }

    public int digitMultiplication(int number){
        int ans = 1;
        int temp;
        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++){
             temp = Character.getNumericValue(numberString.charAt(i));
             ans = ans * temp;
        }

        return ans;
    }

    public void displayMultiplication (){
        System.out.println(digitMultiplication(this.number));
    }

    
}
