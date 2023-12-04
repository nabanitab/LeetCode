package string;

public class PalindromeChecker3 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker3 palindromeChecker = new PalindromeChecker3();

        // Example 1
        String s1 = "aba";
        System.out.println("Output 1: " + palindromeChecker.validPalindrome(s1));

        // Example 2
        String s2 = "abca";
        System.out.println("Output 2: " + palindromeChecker.validPalindrome(s2));

        // Example 3
        String s3 = "abc";
        System.out.println("Output 3: " + palindromeChecker.validPalindrome(s3));
    }
}

