package coreJava.sorting;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare persons based on their age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort the list using Collections.sort(), which relies on Comparable interface
        Collections.sort(people);

        // Print sorted list
        System.out.println("Sorted list of people based on age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

