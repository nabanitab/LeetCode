package string;

import java.util.HashMap;
import java.util.HashSet;
public class WordPattern {


        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");

            if (pattern.length() != words.length) {
                return false;
            }

            HashMap<Character, String> charToWord = new HashMap<>();
            HashSet<String> usedWords = new HashSet<>();

            for (int i = 0; i < pattern.length(); i++) {
                char currentChar = pattern.charAt(i);
                String currentWord = words[i];

                if (charToWord.containsKey(currentChar)) {
                    if (!charToWord.get(currentChar).equals(currentWord)) {
                        return false; // Mismatch in pattern
                    }
                } else {
                    if (usedWords.contains(currentWord)) {
                        return false; // Multiple characters mapped to the same word
                    }

                    charToWord.put(currentChar, currentWord);
                    usedWords.add(currentWord);
                }
            }

            return true;
        }

        public static void main(String[] args) {
            WordPattern solution = new WordPattern();

            // Test cases
            String pattern1 = "abba", s1 = "dog cat cat dog";
            System.out.println(solution.wordPattern(pattern1, s1));  // Output: true

            String pattern2 = "abba", s2 = "dog cat cat fish";
            System.out.println(solution.wordPattern(pattern2, s2));  // Output: false

            String pattern3 = "aaaa", s3 = "dog cat cat dog";
            System.out.println(solution.wordPattern(pattern3, s3));  // Output: false
        }
    }


