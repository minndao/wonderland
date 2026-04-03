
package Lab_10.L10Q1.src;

 abstract class Employee implements EmployeeSalarySystem {
    private String name;
    private String type;
    private double salary;

    Employee(String name, String type, double salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayInfo() {
        System.out.println("----- Employee's info -----");
        System.out.println("Name: " + name);
        System.out.println("Employee type: " + type);
        System.out.println("Salary per month: " + salary);
        System.out.println("---------------------------");
    }

}
