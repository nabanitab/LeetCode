package java8;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapEntryExample {
    public static void main(String[] args) {

        // Step 1: Create a HashMap
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Alice", 5000);
        employeeMap.put("Bob", 7000);
        employeeMap.put("Charlie", 6000);
        employeeMap.put("David", 9000);
        employeeMap.put("Eva", 4000);

        System.out.println("---- Original Map ----");
        employeeMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // Step 2: Iterate using Map.Entry (Java 8 forEach)
        System.out.println("\n---- Using Map.Entry ----");
        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // Step 3: Filter employees with salary > 5000 using stream + entrySet
        System.out.println("\n---- Filter salary > 5000 ----");
        employeeMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 5000)
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        // Step 4: Sort map by value (salary) in descending order
        System.out.println("\n---- Sort by Salary (Descending) ----");
        Map<String, Integer> sortedMap = employeeMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        sortedMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // Step 5: Get the employee with max salary using entrySet()
        Map.Entry<String, Integer> maxEntry = employeeMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println("\nHighest Paid Employee: " + maxEntry.getKey() + " -> " + maxEntry.getValue());
    }
}
