package L9Q2_L9Q3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lecturer extends PersonProfile {
    ArrayList<String> courseName = new ArrayList<>();
    ArrayList<String> courseCode = new ArrayList<>();
    ArrayList<String> semester = new ArrayList<>();
    ArrayList<String> session = new ArrayList<>();
    ArrayList<Integer> creditHour = new ArrayList<>();
    ArrayList<Integer> numOfStudents = new ArrayList<>();

    String fileName;

    Lecturer(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        readText();
    }

    public Double computeCreditHour(Integer creditHour, Integer numOfStudents) {
       
        if(numOfStudents >= 150 ) return creditHour * 3.0;
        else if (numOfStudents < 150 && numOfStudents >= 100) return creditHour * 2.0;
        else if (numOfStudents < 100 && numOfStudents >= 50) return creditHour * 1.5;
        else return creditHour * 1.0 ;
    
    }
    
    
     public void readText() {

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\JackMa\\Md'sRepo\\wonderland\\Labs\\Lab_09\\" + fileName));)
        {   String line;
            while((line = reader.readLine()) != null){
                courseCode.add(line);
                courseName.add(reader.readLine());
                session.add(reader.readLine());
                semester.add(reader.readLine());
                
                creditHour.add(Integer.parseInt(reader.readLine()));
                numOfStudents .add(Integer.parseInt(reader.readLine()));
            }

            System.out.println("\nFile loaded successfully!");
            System.out.println();
        }

        catch(FileNotFoundException e){
            System.out.println("\nFailed to locate the file.");
        }

        catch (NumberFormatException e) {
            System.out.println("\nError in file format.");
        }

        catch(IOException e){
            System.out.println("\nError: " + e.getMessage());
        }
    }

     @Override
    public void display() {
        super.display();
        System.out.println("------------------ Course details -----------------");

        for (int i = 0; i < courseCode.size(); i++){
        
        System.out.println("Course name: " + courseName.get(i));
        System.out.println("Course code: " + courseCode.get(i));
        System.out.println("Semester :" + "#" + semester.get(i));
        System.out.println("Session: " + session.get(i));
        System.out.printf("Total credit hour: %.2f\nNumber of students: %s\n",computeCreditHour(creditHour.get(i),numOfStudents.get(i)),numOfStudents.get(i));
        System.out.println("-----------------------------------------------------");
    }
    }
}
