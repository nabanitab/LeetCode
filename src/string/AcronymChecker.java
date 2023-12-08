package string;

import java.util.ArrayList;
import java.util.List;

public class AcronymChecker {

    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AcronymChecker acronymChecker = new AcronymChecker();

        // Example 1
        List<String> words1 = List.of("alice", "bob", "charlie");
        String s1 = "abc";
        boolean output1 = acronymChecker.isAcronym(words1, s1);
        System.out.println("Output 1: " + output1);

        // Example 2
        List<String> words2 = List.of("an", "apple");
        String s2 = "a";
        boolean output2 = acronymChecker.isAcronym(words2, s2);
        System.out.println("Output 2: " + output2);

        // Example 3
        List<String> words3 = List.of("never", "gonna", "give", "up", "on", "you");
        String s3 = "ngguoy";
        boolean output3 = acronymChecker.isAcronym(words3, s3);
        System.out.println("Output 3: " + output3);
    }
}
