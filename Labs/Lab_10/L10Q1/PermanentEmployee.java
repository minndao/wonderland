package Labs.Lab_10.L10Q1;

public class PermanentEmployee extends Employee  {

    PermanentEmployee(String name, String category) {

        super(name,"Permanent employee",getSalary(category));
        
    }

    private static double getSalary(String category) {
        if (category.equalsIgnoreCase("A")) return 4000;
        else if (category.equalsIgnoreCase("B")) return 3000;
        else if (category.equalsIgnoreCase("C")) return 2000;
        else return 0; 
    }

}
