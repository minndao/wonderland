import java.util.Scanner;

public class T3Q5 {
    public static void main(String[] args) {

        System.out.println("Enter a year. ");
    
    Scanner input = new Scanner(System.in);

    int year = input.nextInt();

    if ((year % 4 == 0) && (year % 100 != 0)  ){
        System.out.printf("%d is a Leap year.",year);
    }else if (year % 400  == 0 ){
        System.out.printf("%d is a Leap year.",year);
    }else{
        System.out.println(year + " is no a Leap year.");
    input.close();
    }

    }

    }

