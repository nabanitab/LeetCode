package interviews;

import java.util.HashSet;

public class PalindromeChecksUsingHashSet {
    public static void main(String[] args) {

        String letters = "abbch";

        int num = 6;

        System.out.println(getPalindrome(letters, num));
    }

    private static String getPalindrome(String letters, int num) {
        HashSet<Character> set = new HashSet<>();

        for (char c : letters.toCharArray()
        ) {
            if (set.contains(c)) {
                set.add(c);

            } else {
                set.remove(c);
            }
        }
        return set.size() <= 1 ? "Yes" : "N0";
    }
}

