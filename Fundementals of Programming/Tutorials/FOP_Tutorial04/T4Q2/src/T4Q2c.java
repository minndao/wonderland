package FOP_Tutorial04.T4Q2.src;

public class T4Q2c {
    public static void main(String[] args) {

        int x = 0, y = 20;

        for (x = 1, y = 20; x < y; x++, y -= 2) {
            System.out.println(x + " " + y);
        }
    }
}
