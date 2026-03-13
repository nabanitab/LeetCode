package hashmap;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        String s = "nabanita";
        String s2 = "nabanita";

        HashMap<Character,Integer> result1 = checkAnagram(s,s2);
        HashMap<Character,Integer> result2 = checkAnagram(s2,s);

        if(result1.equals(result2)){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");

        }

    }

    public static HashMap<Character, Integer> checkAnagram(String s, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        return map;
    }
}