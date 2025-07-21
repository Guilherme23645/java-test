import java.util.Scanner;

public class Main {

    private final static String WELCOME = "What is your name?";
    public static void main(String[] args) {
        // Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME);
        String x = scanner.next();
        System.out.printf("Hi, %s!%n",x);
        scanner.close();
    }
}
