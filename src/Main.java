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
        System.out.println("Third number:");
        var c = scanner.nextInt();
        System.out.printf("Square root of %s is %s%n", c, Math.sqrt(c));
        System.out.println("Fourth number: ");
        var d = scanner.nextInt();
        System.out.println("Fifth number");
        var e = scanner.nextInt();
        System.out.printf("%s to the power of %s is %s",d,e,Math.pow(d,e));
        scanner.close();
    }
}
