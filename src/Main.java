import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with attribute and logic operators
        var scanner = new Scanner(System.in);
        System.out.println("Quanto e 2+2?");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado e 4. Voce errou? (%s)\n", !isRight);
        scanner.close();
    }
}
