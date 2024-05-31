package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

        // Using method reference to filter names starting with "C" and collect them into a new list
        List<String> filteredNames = names.stream()
                .filter(StreamExample::startsWithC)
                .collect(Collectors.toList());

        // Using method reference to print each name in the filtered list
        filteredNames.forEach(System.out::println);
    }

    // Method to check if a string starts with "C"
    private static boolean startsWithC(String name) {
        return name.startsWith("C");
    }
}
