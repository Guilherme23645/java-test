import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with attribute and logic operators
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canDrive = age > 17;
        System.out.printf("Você pode dirigir? (%s)\n", canDrive);
        scanner.close();
    }
}
