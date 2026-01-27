package Labs.Lab_10.L10Q1;

public class ContractStaff extends Employee {

    private static double monthyIncome = 500;

    ContractStaff(String name, double sales) {
        super(name, "Contract staff", (monthyIncome + computeComission(sales)));
    }

    private static double computeComission(double sales) {
        return sales * 0.5;
    }

}
