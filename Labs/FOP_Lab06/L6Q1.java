public class L6Q1 {

    public static int triangular (int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) {
    System.out.println(triangular(20));
}
    
}