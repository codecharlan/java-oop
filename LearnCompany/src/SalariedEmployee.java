public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthName, long employeeID, String hireDate, double annualSalary) {
        super(name, birthName, employeeID, hireDate);
        this.annualSalary = annualSalary;
    }

}
