public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with inheritance and polymorphism
        Manager manager = new Manager("456","Richard","St Something",19,2349,"richard","1dA@43",1200);
        Salesman salesman = new Salesman("789","Gabriel","St Something Else",19,1758,20);
        printEmployee(manager);
        printEmployee(salesman);
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("=======%s=======%n",employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
            case Salesman salesman -> {
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentage());
            }
        }
    }
}
