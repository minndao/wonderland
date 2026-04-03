
package Lab_10.L10Q1.src;

 class TemporaryStaff extends Employee {
    int hour; //Total monthly working hours

    TemporaryStaff(String name, int hour){
        super(name,"Temporary staff",getSalary(hour));
    }
    
   
    public static double getSalary(int hour) {
        return 15*hour;
    }
}
