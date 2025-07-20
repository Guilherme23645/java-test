import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String x = scanner.next();
        System.out.println("Hi, "+x+"!");
        scanner.close();
    }
}
