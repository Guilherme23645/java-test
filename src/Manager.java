public class Manager extends Employee {
    private String login;
    private String password;
    private double commission;

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return this.commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}