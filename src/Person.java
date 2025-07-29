public class Person {
    private String name;
    private int age;
    private static String test;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void setTest(String testValue) {
        test = testValue;
    }

    public static String getTest() {
        return test;
    }
}