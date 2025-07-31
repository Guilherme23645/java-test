public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with inheritance and polymorphism
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("=======%s=======%n",employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                manager.setCode("456");
                manager.setName("Richard");
                manager.setSalary(2349);
                manager.setLogin("richard");
                manager.setPassword("1dA@43");
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
            case Salesman salesman -> {
                salesman.setCode("789");
                salesman.setName("Gabriel");
                salesman.setSalary(1758);
                salesman.setPercentage(20);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentage());
            }
        }
    }
}
