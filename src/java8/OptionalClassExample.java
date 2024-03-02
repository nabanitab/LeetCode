package java8;

import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        Optional<String> optionalName = findName("John");

        // Check if a value is present
        if (optionalName.isPresent()) {
            System.out.println("Name found: " + optionalName.get());
        } else {
            System.out.println("Name not found");
        }
    }

    public static Optional<String> findName(String searchName) {
        // Search logic to find the name
        if (searchName.equals("John")) {
            return Optional.of("John Doe");
        } else {
            return Optional.empty(); // Indicates the name is not found
        }
    }
}
