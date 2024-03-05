package hashmap;

import java.util.HashMap;

public class FindOccurrenceOfElement {

    public static void main(String[] args) {
        String s = "abaaacdddbbbfffcc";
        HashMap<Character, Integer> occurrenceMap = getOccurrenceOfElements(s);
        System.out.println(occurrenceMap);
    }

    public static HashMap<Character, Integer> getOccurrenceOfElements(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
