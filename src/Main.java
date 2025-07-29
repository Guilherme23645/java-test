public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with objects
        Person.setTest("test");
        var male = new Person("Robert", 18);
        var female = new Person("Alice",19);
        System.out.printf("Name: %s, Age: %s%n",male.getName(),male.getAge());
        System.out.printf("Name: %s, Age: %s%n",female.getName(),female.getAge());
        System.out.printf("Static variable: %s%n",Person.getTest());
    }
}
