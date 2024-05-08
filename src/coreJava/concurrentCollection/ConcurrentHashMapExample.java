package coreJava.concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        // Adding elements to the ConcurrentHashMap
        scores.put("John", 10);
        scores.put("Alice", 20);
        scores.put("Bob", 15);

        // Retrieving elements from the ConcurrentHashMap
        System.out.println("John's score: " + scores.get("John"));
        System.out.println("Alice's score: " + scores.get("Alice"));
        System.out.println("Bob's score: " + scores.get("Bob"));

        // Updating elements in the ConcurrentHashMap
        scores.put("Alice", 25); // Alice's score updated to 25

        // Removing elements from the ConcurrentHashMap
        scores.remove("John");

        // Iterating over the ConcurrentHashMap
        System.out.println("Scores:");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }
}

