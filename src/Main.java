import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Dealing with arithmetic operators
        var scanner = new Scanner(System.in);
        System.out.println("First number: ");
        var a = scanner.nextInt();
        System.out.println("Second number:");
        var b = scanner.nextInt();
        System.out.printf("%s + %s = %s%n",a,b,a+b);
        System.out.println("Another number:");
        var c = scanner.nextInt();
        System.out.printf("Square root of %s is %s%n", c, Math.sqrt(c));
        scanner.close();
    }
}
