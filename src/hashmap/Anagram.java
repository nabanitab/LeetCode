package hashmap;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        String s = "nabanita";
        String s2 = "susmita";

        HashMap<Character,Integer> result1 = checkAnagram(s,s2);
        HashMap<Character,Integer> result2 = checkAnagram(s2,s);

        if(result1.equals(result2)){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }

    }

    public static HashMap<Character,Integer> checkAnagram(String s, String s2 ){

        HashMap<Character,Integer> map = new HashMap<>();

        for (char c:s.toCharArray()
             ) {
           map.put(c, map.getOrDefault(c,0)+1);
        }

        for (char c:s2.toCharArray()
             ) {
            map.put(c, map.getOrDefault(c,0)-1);
        }
        return  map;
    }
}
