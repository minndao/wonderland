package Tutorial_10.T10Q3.src;

import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        
        Person[] people = new Person[] {new Person("Jordan"), new Person("Lucious"), new Person("Bruce")};

        System.out.println("Before sorting: ");

        for (Person person : people) {
           System.out.println(person.getName());
        }

        System.out.println();

        Arrays.sort(people);

        System.out.println("After sorting: ");

        for (Person person : people) {
            person.display();
        }

        

    }
}
