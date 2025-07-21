import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with arithmetic operators
        var scanner = new Scanner(System.in);
        System.out.println("First number: ");
        var a = scanner.nextInt();
        System.out.println("Second number:");
        var b = scanner.nextInt();
        System.out.printf("%s + %s = %s",a,b,a+b);
        scanner.close();
    }
}
