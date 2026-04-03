package Tutorial_08.T8Q3.src;

public class Tester {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate();
        Coordinate c2 = new Coordinate(1,2);
        Coordinate c3 = new Coordinate(3,3);

        c1.display();
        c2.display();
        c3.setX(67);
        c3.setY(45);
        c3.display();   
    }
}
