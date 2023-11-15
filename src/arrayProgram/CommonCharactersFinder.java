package arrayProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CommonCharactersFinder {
    public List<String> commonChars(String[] words) {
        // Initialize a map to store character frequency for the first word
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Iterate through the rest of the words and update character frequency
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentFrequency = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                currentFrequency.put(c, currentFrequency.getOrDefault(c, 0) + 1);
            }

            // Update the character frequency based on the intersection with the current word
            for (char key : charFrequency.keySet()) {
                charFrequency.put(key, Math.min(charFrequency.get(key), currentFrequency.getOrDefault(key, 0)));
            }
        }

        // Build the result list based on the final character frequency
        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CommonCharactersFinder finder = new CommonCharactersFinder();

        // Test cases
        String[] words1 = {"bella", "label", "roller"};
        System.out.println(finder.commonChars(words1)); // Output: ["e","l","l"]

        String[] words2 = {"cool", "lock", "cook"};
        System.out.println(finder.commonChars(words2)); // Output: ["c","o"]
    }
}

