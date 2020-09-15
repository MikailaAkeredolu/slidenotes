package slides;

public class SalariedEmployee extends Employee {
    private double yearlySalary;

    public SalariedEmployee(String name, int age, float hoursWorked, double yearlySalary, HireDate hireDate) {
        super(name, age, hoursWorked, hireDate);
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
}
