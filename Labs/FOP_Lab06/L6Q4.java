public class L6Q4 {
    public static int method1 (int a, int b) {
        int small, big;
        if (a<b){
             small = a;
             big = b;
        }else {
                 small = b;
                 big = a;
            }

            int remainder = big % small;
            while (remainder != 0) {
               remainder = big % small;
               big = small;
                small = remainder;

            } return big;


        }
        public static void main(String[] args) {
            System.out.println(method1(24, 8));
            System.out.println(method1(200, 625));
        }
    }

