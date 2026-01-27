import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        String firstday;
        System.out.print("Enter a year: ");
        year = input.nextInt();

        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        firstday = input.next();

        System.out.println();

        // use the collected inputs to print the calendar
        printcalendar(year, firstday);
input.close();
    }

public static void printcalendar(int year, String firstday) {
    int month, empty_space, initial_space = 0, initial_days = 0;
    int[] months_space = new int[12];
    Scanner input = new Scanner(System.in);
    
    switch (firstday) {
        case "0":
            initial_space = 0;
            break;
        case "1":
            initial_space = 1;
            break;
        case "2":
            initial_space = 2;
            break;
        case "3":
            initial_space = 3;
            break;
        case "4":
            initial_space = 4;
            break;
        case "5":
            initial_space = 5;
            break;
        case "6":
            initial_space = 6;
            break;
        
    }

    System.out.print("Enter the month (1-12): ");   
    month = input.nextInt();

    months_space[0] = 31; // January
    months_space[2] = 31; // March
    months_space[3] = 30; // April      
    months_space[4] = 31; // May
    months_space[5] = 30; // June
    months_space[6] = 31; // July
    months_space[7] = 31; // August
    months_space[8] = 30; // September
    months_space[9] = 31; // October
    months_space[10] = 30; // November
    months_space[11] = 31; // December

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        months_space[1] = 29; // February in a leap year
    } else {
        months_space[1] = 28; // February in a non-leap year
    }

    for (int i = 0; i < month - 1; i++) {
        initial_days += months_space[i];
    }

    empty_space = (initial_days + initial_space) % 7;
    System.out.println();

    switch (month) {
        case 1:
            System.out.println("January " + year);
            break;
    case 2:
            System.out.println("February " + year);
            break;
    case 3:
            System.out.println("March " + year);
            break;
    case 4:
            System.out.println("April " + year);
            break;
    case 5:
            System.out.println("May " + year);
            break;
    case 6:
            System.out.println("June " + year);
            break;
    case 7:
            System.out.println("July " + year);
            break;
    case 8:
            System.out.println("August " + year);
            break;
    case 9:
            System.out.println("September " + year);
            break;
    case 10:
            System.out.println("October " + year);
            break;
    case 11:
            System.out.println("November " + year);
            break;
    case 12:
            System.out.println("December " + year);
            break;
        
    }
    System.out.println();
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    for (int i = 1; i <=  empty_space; i++) {
        System.out.print("    ");
    }

    for(int i = 1; i <= months_space[month - 1]; i++) {
        System.out.printf("%3d ", i);
        if ((i + empty_space) % 7 == 0 ) {
            System.out.println();
        }
    }
    System.out.println();
    input.close();
}
}