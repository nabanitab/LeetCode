package string;

import java.util.ArrayList;
import java.util.List;

public class Substrings {
    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        int n = str.length();

        // Generate all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        String input = "abcaa";
        List<String> substrings = generateSubstrings(input);

        // Print all generated substrings
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}

