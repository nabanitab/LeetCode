package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamApiExample {

    public static void main(String[] args) {
        // Sample list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 23),
                new Person("Bob", 34),
                new Person("Charlie", 28),
                new Person("David", 45),
                new Person("Eve", 30),
                new Person("Frank", 20)
        );

        // Using Stream API to filter, sort, and collect names
        List<String> processedNames = people.stream()
                .filter(person -> person.getAge() > 25)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .map(Person::getName)
                .collect(Collectors.toList());

        // Print the results
        processedNames.forEach(System.out::println);
    }
}
