package string;

import java.util.HashMap;
import java.util.Map;
public class LongestPalindrome {


        public int longestPalindrome(String s) {
            Map<Character, Integer> charCount = new HashMap<>();

            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            int length = 0;
            boolean hasOddFrequency = false;

            for (int count : charCount.values()) {
                length += count / 2 * 2;
                if (count % 2 != 0) {
                    hasOddFrequency = true;
                }
            }

            return hasOddFrequency ? length + 1 : length;
        }

        public static void main(String[] args) {
            LongestPalindrome solution = new LongestPalindrome();

            // Test cases
            String test1 = "abccccdd";
            System.out.println(solution.longestPalindrome(test1));  // Output: 7

            String test2 = "a";
            System.out.println(solution.longestPalindrome(test2));  // Output: 1
        }
    }

