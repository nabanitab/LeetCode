package hashCodeEqualMethod;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create two Person objects with the same id and name
        Person p1 = new Person(1, "Alice");
        Person p2 = new Person(1, "Alice");

        // Add the first object to a HashMap
        HashMap<Person, String> map = new HashMap<>();
        map.put(p2, "Developer");

        // Check if the second object can retrieve the value
        System.out.println(map.get(p1)); // Output: Developer
    }
}


