package string;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToTMap.containsKey(sChar)) {
                if (sToTMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sToTMap.put(sChar, tChar);
            }

            if (tToSMap.containsKey(tChar)) {
                if (tToSMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tToSMap.put(tChar, sChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        // Example usage
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isomorphicStrings.isIsomorphic(s1, t1)); // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isomorphicStrings.isIsomorphic(s2, t2)); // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isomorphicStrings.isIsomorphic(s3, t3)); // Output: true
    }
}

