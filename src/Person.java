public class Person {
    private String name;
    private int age;
    private static String test;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setTest(String testValue) {
        test = testValue;
    }

    public static String getTest() {
        return test;
    }
}