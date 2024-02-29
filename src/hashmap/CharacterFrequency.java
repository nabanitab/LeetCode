package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character, Integer> countFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> frequencyMap = countFrequency(str);
        System.out.println(frequencyMap);
    }
}
