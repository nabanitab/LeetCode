package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to char array
        char[] charArray = input.toCharArray();

        // Iterate through the char array
        for (char c : charArray) {
            // Ignore spaces
            if (c != ' ') {
                // Update the count in the map
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the occurrences
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}

