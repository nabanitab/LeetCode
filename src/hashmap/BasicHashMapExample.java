package hashmap;

import java.util.HashMap;

public class BasicHashMapExample {

        public static void main(String[] args) {
            // Create a new HashMap with key of type String and value of type Integer
            HashMap<String, Integer> studentScores = new HashMap<>();

            // Add entries to the HashMap
            studentScores.put("John", 90);
            studentScores.put("Alice", 85);
            studentScores.put("Bob", 88);

            // Access values using keys
            int johnsScore = studentScores.get("John");
            System.out.println("John's score: " + johnsScore);

            // Update an entry
            studentScores.put("Alice", 92);
            System.out.println("Alice's updated score: " + studentScores.get("Alice"));

            // Remove an entry
            studentScores.remove("Bob");
            System.out.println("Bob's score after removal: " + studentScores.get("Bob"));

            // Check if a key exists
            if (studentScores.containsKey("Alice")) {
                System.out.println("Alice's score is present");
            }

            // Iterate over the entries
            System.out.println("Student scores:");
            for (String name : studentScores.keySet()) {
                int score = studentScores.get(name);
                System.out.println(name + ": " + score);
            }

            System.out.println("Number of students: " + studentScores.size());
        }
    }


