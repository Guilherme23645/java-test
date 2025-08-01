import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Alice",19),
            new User("Charlie",18),
            new User("Pedro",24),
            new User("Elizabeth",34)
        );

        printStringValue(User::toString, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}