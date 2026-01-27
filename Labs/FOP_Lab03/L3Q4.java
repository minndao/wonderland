import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random rd = new Random(); 
        int p1 = 0, p2 = 0;
        int num1 = rd.nextInt(6) + 1;
        int num2 = rd.nextInt(6) + 1;
        System.out.println("Player 1 rolls " + num1 + ".");
        System.out.println("Player 1 rolls " + num2 + ".");

        int num3 = rd.nextInt(6) + 1;
        int num4 = rd.nextInt(6) + 1;
        System.out.println("Player 2 rolls " + num3 + ".");
        System.out.println("Player 2 rolls " + num4 + ".");

        p1 = num1 + num2;
        p2 = num3 + num4;

        if (p1 > p2){
            System.out.println("Player 1 wins with a total of " + p1 + " points.");
        } else if (p2 > p1){
            System.out.println("Player 2 wins with a total of " + p2 + " points.");
        } else {
            System.out.println("Draw with both players scroring " + p1 + " points.");
        }





}

}
