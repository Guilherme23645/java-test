public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with inheritance and polymorphism
        printEmployee(new Manager());
    }

    public static void printEmployee(Employee employee) {
        employee.setName("Richard");
        ((Manager)employee).setLogin("richard");
        ((Manager)employee).setPassword("1dA@43");

        System.out.println(employee.getClass());
        System.out.println(employee.getName());
        System.out.println(((Manager)employee).getLogin());
        System.out.println(((Manager)employee).getPassword());
    }
}
