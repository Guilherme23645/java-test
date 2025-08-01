public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with inheritance and polymorphism
        Employee employee = new Employee();
        Salesman salesman = new Salesman();
        Employee manager = new Manager();

        System.out.println(manager instanceof Manager);
    }
}
