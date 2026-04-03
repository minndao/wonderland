package Tutorial_09.T9Q1.src;

public class Main {

    
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        
        System.out.println(compare(s,t));
        System.out.println(isClass(s));
    }

    public static boolean isClass(Student x){
        return x instanceof Person;
    }

    public static boolean compare(Student s, Teacher t){
        return s.getClass().equals(t.getClass());

    }
}
