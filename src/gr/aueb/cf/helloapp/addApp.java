package gr.aueb.cf.helloapp;

public class addApp {

    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.printf("%4d", add(7,2));
        System.out.printf("%d\n", add(3,5));
        //System.out.println("test");
        System.out.printf("result: %d", pol(10, 20));
        System.out.println("test of merge");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int pol(int a, int b) {
        return a*b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }
}
