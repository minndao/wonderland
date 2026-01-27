package Labs.Lab_10.L10Q4;

import java.io.*;
import java.util.Scanner;

public class Appointment implements Searchable {

    private int day;
    private int month;
    private int year;
    private int startTime;
    private int endTime;

    private static String filePath = "C:\\Users\\JackMa\\Md'sRepo\\wonderland\\Labs\\Lab_10\\L10Q4\\Appointment.txt";

    Appointment() { //To access the 'search' method
    }


    Appointment(int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
        saveAppointment();
    }

    public void saveAppointment() {
    
    if (search(day+"/"+month+"/"+year+" "+startTime,day+"/"+month+"/"+year+" "+endTime)){
        try (FileWriter fw = new FileWriter(filePath,true);
            BufferedWriter writer = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(writer);) {

            pw.printf("""
                    %d
                    %d
                    %d
                    %d
                    %d
                    """,day,month,year,startTime,endTime);

                    System.out.printf("Success: Appointment saved for %d/%d/%d [%d:00 - %d:00]\n", day,month,year,startTime,endTime);
            
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file.");
        }

        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }}
        
    }

    @Override
    public boolean search(String dateStartTime, String dateEndTime) {
        String[] bigPart = dateStartTime.split(" ");       //Expected outcome: DD/MM/YYYY HH
        String[] firstHalf = bigPart[0].split("/");
        String[] endTime = dateEndTime.split(" ");

        int newDay = Integer.parseInt(firstHalf[0]);
        int newMonth = Integer.parseInt(firstHalf[1]);
        int newYear = Integer.parseInt(firstHalf[2]);
        int newStartHour = Integer.parseInt(bigPart[1]);
        int newEndHour = Integer.parseInt(endTime[1]);

        try (Scanner sc = new Scanner(new FileReader(filePath))) {

            while (sc.hasNextInt()) {
                int oldDay = sc.nextInt();
                int oldMonth = sc.nextInt();
                int oldYear = sc.nextInt();
                int oldStartHour = sc.nextInt();
                int oldEndHour = sc.nextInt();

                if (newDay == oldDay && newMonth == oldMonth && oldYear == newYear) {
                    if (newStartHour < oldEndHour && newEndHour > oldStartHour ) {
                        System.out.printf("The slot %d/%d/%d [%d:00 - %d:00] slot has been booken. Please try another slot.\n",newDay,newMonth,newYear,newStartHour,newEndHour);
                        return false;
                    }
                } 

            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Unable to locate the file.");
        }

        System.out.printf("The slot %d/%d/%d [%d:00 - %d:00] is available.\n",newDay,newMonth,newYear,newStartHour,newEndHour);
        return true;
    }
    
}
