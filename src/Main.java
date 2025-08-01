import keyword.*;

public class Main {
    public static void main(String[] args) {
        var user = new Client();
        user.setName("Mario");
        System.out.println(user.getName());
        var address = new Address();
        address.description = "love";
    }
}
