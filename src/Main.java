public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with objects
        var male = new Person();
        male.setName("Robert");
        male.setAge(18);
        var female = new Person();
        female.setName("Alice");
        female.setAge(19);
        System.out.printf("Name: %s, Age: %s%n",male.getName(),male.getAge());
        System.out.printf("Name: %s, Age: %s%n",female.getName(),female.getAge());
    }
}
