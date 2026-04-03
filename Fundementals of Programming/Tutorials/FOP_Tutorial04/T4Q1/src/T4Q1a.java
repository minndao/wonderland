package FOP_Tutorial04.T4Q1.src;

public class T4Q1a {
    public static void main(String[] args) {
        int i = 0;
        while (Math.pow(i + 1,3) < 2000)
        {i++;
        }
        System.out.printf("The largest number whose cube is less than  2000 is %d.",i );
    }
}
