package week8;

public class StackOverflowEx {
    public static void main(String[] args) {
        try {
            foo();
        } catch (StackOverflowError e) {
            System.out.println("In catch");
            foo();
        }
    }

    public static void foo() {
        foo();
    }
}
