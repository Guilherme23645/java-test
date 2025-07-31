public class Salesman extends Employee {
    private double percentagePerSale;
    private double soldAmount;

    public Salesman (String code,String name,String address,int age, int salary, double percentagePerSale, double soldAmount) {
        super(code,name,address,age,salary);
        this.percentagePerSale = percentagePerSale;
        this.soldAmount = soldAmount;
    }

    public double getPercentage() {
        return this.percentagePerSale;
    }

    public void setPercentage(double percentagePerSale) {
        this.percentagePerSale = percentagePerSale;
    }

    @Override
    public String getCode() {
        return "SL"+super.getCode();
    }

    public double getSoldAmount() {
        return this.soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getFullSalary() {
        return super.getSalary() + (this.soldAmount * this.percentagePerSale) / 100;
    }
}