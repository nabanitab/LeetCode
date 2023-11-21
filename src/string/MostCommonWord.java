package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert paragraph to lowercase and replace non-alphabetic characters with spaces
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]+", " ");

        // Split paragraph into words
        String[] words = paragraph.split("\\s+");

        // Create a set of banned words for efficient lookup
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        // Create a frequency map to count occurrences of each word
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Find the word with the maximum frequency
        String mostCommonWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostCommonWord;
    }

    public static void main(String[] args) {
        MostCommonWord solution = new MostCommonWord();

        // Example 1
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        System.out.println(solution.mostCommonWord(paragraph1, banned1)); // Output: "ball"

        // Example 2
        String paragraph2 = "a.";
        String[] banned2 = {};
        System.out.println(solution.mostCommonWord(paragraph2, banned2)); // Output: "a"
    }
}

