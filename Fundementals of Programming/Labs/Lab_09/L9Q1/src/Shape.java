
package Lab_09.L9Q1.src;

 class Shape {
    private String name;
    private double perimeter;
    private double area;

    Shape(String name) {
        this.name = name;
        
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display() {
        System.out.println("\nName of the shape: " + this.name);
        System.out.printf("Perimeter: %.2f\nArea: %.2f",perimeter,area);
        System.out.println();
    }
}
