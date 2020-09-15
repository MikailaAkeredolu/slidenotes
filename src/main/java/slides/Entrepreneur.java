package slides;

public class Entrepreneur extends Person{
    private double investment;
    private double revenue;

    public Entrepreneur(String name, double investment, double revenue) {
        super(name);
        this.investment = investment;
        this.revenue = revenue;
    }

    //omitted constructor and getters & setters
    public String toString() {
        return "Entrepreneur's name is : " + this.getName();
    }

    public double calculateProfits(){
        return revenue - investment;
    }
}
