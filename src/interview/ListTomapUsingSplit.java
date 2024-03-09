package interview;

import java.util.HashMap;
import java.util.List;

public class ListTomapUsingSplit {

        public static void main(String[] args) {
            List<String> stringList = List.of("user1: message 1", "user2: message 2", "user3: message 3");

            HashMap<String, String> hashMap = new HashMap<>();

            for (String str : stringList) {
                // Split each string by ": " to separate user identifier and message
                String[] parts = str.split(": ", 2);

                if (parts.length == 2) { // Ensure that the string contains both user identifier and message
                    String user = parts[0];
                    String message = parts[1];

                    // Store user and message in the HashMap
                    hashMap.put(user, message);
                }
            }

            // Print the HashMap
            System.out.println("HashMap:");
            for (String user : hashMap.keySet()) {
                System.out.println(user + " : " + hashMap.get(user));
            }
        }
    }


