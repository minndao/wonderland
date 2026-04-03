package Tutorial_08.T8Q1.src;

public class Student {
    String contactNumbers;
    
    public Student(){
        this.contactNumbers = null;
    }

    public Student(String contactNumbers){
        this.contactNumbers = contactNumbers;
    }

    public String getContactNumbers(){
        return contactNumbers;
    }

    public void setContactNumbers(String contactNumbers){
        this.contactNumbers = contactNumbers;
    }
    
    public void display(){
        System.out.println(this.contactNumbers);
    }

public static void main(String[] args) {
    Student Jordan = new Student();
    Jordan.setContactNumbers("0123456789");
    Jordan.display();


}
}



