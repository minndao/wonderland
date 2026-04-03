
package FOP_Lab04.src;

import java.util.Random;

 class L4Q6 {
    public static void main(String[] args) {
        Random random = new Random();
int num = random.nextInt();
        System.out.println("Random Integer: " + Math.abs(num));

 int digitcount = 0;

    for (int i = 0; i < String.valueOf(Math.abs(num)).length(); i++) {
      
        digitcount ++;
    }
    System.out.println("Number of digits : " + digitcount);
    }
}
