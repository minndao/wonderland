package L9Q2_L9Q3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Student extends PersonProfile {
    private ArrayList<String> courseName = new ArrayList<>();
    private ArrayList<String> courseCode = new ArrayList<>();
    private ArrayList<Integer> semester = new ArrayList<>();
    private ArrayList<String> session = new ArrayList<>();
    private ArrayList<Double> mark = new ArrayList<>();
   
    private String fileName;

    Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        readText();
    }

    public void readText() {

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\JackMa\\Md'sRepo\\wonderland\\Labs\\Lab_09\\" + fileName));)
        {   String line;
            while((line = reader.readLine()) != null){
                courseCode.add(line);
                courseName.add(reader.readLine());
                session.add(reader.readLine());
                
                String semesterStr = reader.readLine();
                String markStr = reader.readLine();

                semester.add(Integer.parseInt(semesterStr));
                mark.add(Double.parseDouble(markStr));
            }

            System.out.println("File loaded successfully!");
            System.out.println();
        }

        catch(FileNotFoundException e){
            System.out.println("Failed to locate the file.");
        }

        catch (NumberFormatException e) {
            System.out.println("Error in file format.");
        }

        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getGrade(Double mark) {
        if(mark >= 85) return "A";
        else if(mark >= 75) return "A-";
        else if(mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("------------------ Course details -----------------");

        for (int i = 0; i < courseName.size(); i++){
        
        System.out.println("Course name: " + courseName.get(i));
        System.out.println("Course code: " + courseCode.get(i));
        System.out.println("Semester :" + "#" + semester.get(i));
        System.out.println("Session: " + session.get(i));
        System.out.printf("Result: %.2f\nGrade: %s\n",mark.get(i),getGrade(mark.get(i)));
        System.out.println("-----------------------------------------------------");
    }
    }

}
