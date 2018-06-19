package methods;

public class FooBarBaz {
    public static void foo() {
        System.out.println("foo");
    }
    public static void bar() {
        foo();
        System.out.println("bar");
        baz();
    }
    public static void baz() {
        System.out.println("baz");
        foo();
        bar();
    }
    public static void main(String[] args) {
        foo();
        bar();
        baz();
    }
}