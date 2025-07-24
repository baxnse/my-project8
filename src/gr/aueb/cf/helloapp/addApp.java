package gr.aueb.cf.helloapp;

public class addApp {

    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.printf("%d", add(3,5));
        System.out.println("test");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
