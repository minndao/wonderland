package Tutorials.Tutorial_10.T10Q3;

public class Person implements Comparable<Person> {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }

    @Override
    public int compareTo (Person other) {
        return this.name.compareTo(other.getName());
    }
}
