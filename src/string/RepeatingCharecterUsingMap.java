package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingCharecterUsingMap {

    public static void main(String[] args) {
        String s = "nabanita";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}


