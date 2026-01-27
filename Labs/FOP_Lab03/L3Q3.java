    import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the sales volume.");
    double sv = input.nextDouble();
    double com = 0;
    if (sv < 0){
        System.out.println("Invalid sales volume.");
        } else if (sv <= 100) {
        com = sv * 0.05;
        } else if (sv <= 500 && sv > 100) {
            com = sv * 0.075;
        } else if (sv <= 1000 && sv > 500) {
            com = sv * 0.10;    
        } else {
            com = sv * 0.13;
        }
        System.out.printf("The commission is %.2f.", com);
        input.close();

    }



    }
