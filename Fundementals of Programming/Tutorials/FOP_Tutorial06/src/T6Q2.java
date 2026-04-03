package FOP_Tutorial06.src;

public class T6Q2 {
    public static void decreasing (int a, int b, int c){
        if (a >= b && b >= c ){
            System.out.println(a + " " + b + " " + c );
        }
        else if (a >= c && c >= b){
            System.out.println(a + " " + c + " " + b );
        }
        else if (b >= a && a >= c){
            System.out.println(b + " " + a + " " + c );
        }
        else if (b >= c && c >= a){
            System.out.println(b + " " + c + " " + a );
        }
        else if (c >= a && a >= b){
            System.out.println(c + " " + a + " " + b );
        }
        else{
            System.out.println(c + " " + b + " " + a );
        }
    }

    public static void main(String[] args) {
        decreasing(14,6,77);
    }
    
}
