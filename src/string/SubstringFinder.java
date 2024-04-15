package string;

import java.util.ArrayList;
import java.util.List;

public class SubstringFinder {
    public static List<String> findSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        String input = "abca";
        List<String> substrings = findSubstrings(input);
        System.out.println("Substrings of \"" + input + "\": " + substrings);
    }
}
