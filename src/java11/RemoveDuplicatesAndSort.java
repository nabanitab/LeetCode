package java11;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a list of integers separated by commas:");

        while (true) {
            String input = scanner.nextLine();
            try {
                numbers = Arrays.stream(input.split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers separated by commas:");
            }
        }

        // Remove duplicates and sort
        List<Integer> sortedUniqueNumbers = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted list without duplicates: " + sortedUniqueNumbers);
    }
}
