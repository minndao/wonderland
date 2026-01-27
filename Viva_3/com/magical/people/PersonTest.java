package com.magical.people;

public class PersonTest {
    public static void main(String[] args) {
            Person person1 = new Person();
            Person person2 = new Person("Bernard", 19);
            Person person3 = new Person("Jason",55); 
            Person person4 = new Person("Jovita", 19);

            person3.setAge(21);
            System.out.println("Person 3's age: " + person3.getAge());
            
            try {
                person1.setAge(-77);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught an exception when setting age: " + e.getMessage());
            }

            System.out.println("Is Bernard and Jovita the same age? " + "Answer: " + person2.compareTo(person4));
            System.out.println("Is Bernard and Jason the same age? " + "Answer: " + person2.compareTo(person3));
            
            System.out.println("Total number of students in the academy: " + Person.getPersonCount());

    }
}
