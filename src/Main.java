public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with objects
        var male = new Person();
        male.name = "Robert";
        male.age = 18;
        var female = new Person();
        female.name = "Alice";
        female.age = 19;
        System.out.printf("Name: %s, Age: %s",male.name,male.age);
        System.out.printf("Name: %s, Age: 5s",female.name,female.age);
    }
}
