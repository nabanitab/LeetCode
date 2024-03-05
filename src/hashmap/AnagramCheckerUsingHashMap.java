package hashmap;

import java.util.HashMap;

public class AnagramCheckerUsingHashMap {
    public static void main(String[] args) {
        String str1 = "mam";
        String str2 = "mam";

        HashMap<Character, Integer> map1 = getAnagram(str1, str2);
        HashMap<Character, Integer> map2 = getAnagram(str2, str1); // Since anagrams are symmetric

        if (map1.equals(map2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }

    public static HashMap<Character, Integer> getAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        return map;
    }
}
