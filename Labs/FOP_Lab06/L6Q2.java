public class L6Q2 {
    public static void multiPrint (int n, char c){
        for (int i = 0; i < n; i++){
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Triangle:");
        System.out.print("  ");
        multiPrint(1, '1');
        System.out.print(" ");
        multiPrint(3,'1');
        multiPrint(5, '1');

        System.out.println("Diamond:");
        System.out.print(" ");
        multiPrint(3, '1');
        multiPrint(5, '1');
        System.out.print(" ");
multiPrint(3, '1');
System.out.print("  ");
multiPrint(1, '1');



    }
}
