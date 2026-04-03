
package Lab_09.L9Q2_L9Q3.src;

 class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jordan", "Male","14/08/2006" , "course.txt");
        s1.display();

        Lecturer l1 = new Lecturer("Bruce Wayne", "Male", "02/08/1984", "lecturer.txt");
        l1.display();
    }
}
