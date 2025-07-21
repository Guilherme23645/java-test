import java.util.Scanner;

public class Main {

    private final static String WELCOME = "What is your name?";
    public static void main(String[] args) throws Exception {
        // Reading input
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME);
        var x = scanner.next();
        System.out.printf("Hi, %s!%n",x);
        scanner.close();
    }
}
