public final class Salesman extends Employee {
    private double percentagePerSale;

    public Salesman (String code,String name,String address,int age, int salary, double percentagePerSale) {
        super(code,name,address,age,salary);
        this.percentagePerSale = percentagePerSale;
    }

    public double getPercentage() {
        return this.percentagePerSale;
    }

    public void setPercentage(double percentagePerSale) {
        this.percentagePerSale = percentagePerSale;
    }
}