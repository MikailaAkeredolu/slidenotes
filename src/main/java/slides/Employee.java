package slides;

public class Employee extends Person{
    private float hoursWorked;
    private HireDate hireDate;
    public Employee(String name, int age,float hoursWorked, HireDate hireDate){
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.hireDate = hireDate;
    }


    public void calculatePay(){
        System.out.println("Everyone gets paid differently");
    }

    @Override
    public String toString() {
        return super.toString() + " hoursWorked: " + hoursWorked + " hireDate: " + hireDate;
    }

}
