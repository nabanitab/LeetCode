package coreJava.string;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        // Create a 2D array to store whether a substring is a palindrome
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println("Longest palindromic substring of " + s1 + ": " + longestPalindrome(s1));
        System.out.println("Longest palindromic substring of " + s2 + ": " + longestPalindrome(s2));
    }
}
