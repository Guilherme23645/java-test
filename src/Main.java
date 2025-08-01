import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Alice",19),
            new User("Charlie",18),
            new User("Pedro",24),
            new User("Elizabeth",34)
        );

        users.forEach(user -> System.out.printf("Name: %s, Age: %s%n", user.name(),user.age()));
    }
}