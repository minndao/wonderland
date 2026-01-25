package L9Q2_L9Q3;

public class PersonProfile {
    String name;
    String gender;
    String dateOfBirth;

    PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender );
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println();
    }

    

    
}
