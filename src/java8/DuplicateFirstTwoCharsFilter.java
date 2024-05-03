package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateFirstTwoCharsFilter {
    public static void main(String[] args) {
        String[] array = {"ram", "sam", "tham", "banana", "ramma", "orange"};

        // Create a map to store the first two characters and the corresponding element
        Map<String, String> firstTwoCharsMap = new HashMap<>();

        // Filter and print elements with the same first two characters
        Arrays.stream(array)
                .forEach(s -> {
                    String firstTwoChars = s.substring(0, Math.min(s.length(), 2));
                    if (firstTwoCharsMap.containsKey(firstTwoChars)) {
                        System.out.println(firstTwoCharsMap.get(firstTwoChars));
                        System.out.println(s);
                    } else {
                        firstTwoCharsMap.put(firstTwoChars, s);
                    }
                });
    }
}
