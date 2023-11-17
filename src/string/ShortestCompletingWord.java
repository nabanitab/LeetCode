package string;

import java.util.HashMap;
import java.util.Map;

class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> licensePlateMap = new HashMap<>();
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                licensePlateMap.put(c, licensePlateMap.getOrDefault(c, 0) + 1);
            }
        }

        String shortestWord = "";
        int minLength = Integer.MAX_VALUE;

        for (String word : words) {
            if (isCompletingWord(licensePlateMap, word) && word.length() < minLength) {
                shortestWord = word;
                minLength = word.length();
            }
        }

        return shortestWord;
    }

    private boolean isCompletingWord(Map<Character, Integer> licensePlateMap, String word) {
        Map<Character, Integer> wordMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : licensePlateMap.entrySet()) {
            char letter = entry.getKey();
            int requiredCount = entry.getValue();

            if (wordMap.getOrDefault(letter, 0) < requiredCount) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ShortestCompletingWord solution = new ShortestCompletingWord();

        // Test case
        String[] words1 = {"step", "steps", "stripe", "stepple"};
        System.out.println(solution.shortestCompletingWord("1s3 PSt", words1));  // Output: "steps"

        String[] words2 = {"looks", "pest", "stew", "show"};
        System.out.println(solution.shortestCompletingWord("1s3 456", words2));  // Output: "pest"
    }
}

