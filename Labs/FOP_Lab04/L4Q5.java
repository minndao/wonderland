    import java.util.Random;


public class L4Q5 {
    public static void main(String[] args) {
        Random random = new Random();
         
        int p1 = 0, p2 = 0, sum1 = 0, sum2 = 0;
        

while (sum1 < 100 && sum2 < 100){
    do {
        p1 = random.nextInt(6) + 1;
        sum1 += p1;
        System.out.println("Player 1 rolled: " + p1 + " | Total score: " + sum1);
    } while (p1 == 6 && sum1 < 100);

    if (sum1 >= 100) {
        System.out.println("Player 1 wins!");
        break;}

        if (sum1 < 100) {
            do {
                p2 = random.nextInt(6) + 1;
                sum2 += p2;
                System.out.println("Player 2 rolled: " + p2 + " | Total score: " + sum2);
            } while (p2 == 6 && sum2 < 100);}


            if (sum2 >= 100) {
                System.out.println("Player 2 wins!");
                break;}
            }
    }
}
    
