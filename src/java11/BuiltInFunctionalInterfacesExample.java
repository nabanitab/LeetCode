package java11;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfacesExample {
    public static void main(String[] args) {
        // Function: Takes one argument and produces a result
        Function<Integer, String> intToString = Object::toString;
        System.out.println("Function: " + intToString.apply(123));

        // Predicate: Takes one argument and returns a boolean
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Predicate: " + isEven.test(4));

        // Consumer: Takes one argument and returns no result
        Consumer<String> print = System.out::println;
        print.accept("Consumer: Hello, World!");

        // Supplier: Takes no argument and returns a result
        Supplier<String> supplier = () -> "Supplier: Hello from Supplier!";
        System.out.println(supplier.get());
    }
}

