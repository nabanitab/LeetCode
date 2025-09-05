package java8;

public class FunctinalInterCall {
    public static void main(String[] args) {
        // Implement using lambda
        MyFunctionalInterface obj = () -> System.out.println("Hello from functional interface!");

        obj.sayHello();  // Output: Hello from functional interface!
    }
}

