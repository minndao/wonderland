package T4Q2;
public class T4Q2b {
    public static void main(String[] args) {
        int x = 0, y = 0;
        
        do {
            x += 2; y += x; System.out.println(x + " and " + y);
        } while (x < 100);
    }
}
