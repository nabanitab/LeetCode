package hashmap;

import java.util.*;
//Given a string, find the first non-repeating character and return its index. If no such character exists, return -1



public class FirstNonRepeatingChar {
    public static int firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return str.indexOf(entry.getKey());
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String str = "leetcode";
        int index = firstNonRepeatingChar(str);
        System.out.println("Index of first non-repeating character: " + index);
    }
}
