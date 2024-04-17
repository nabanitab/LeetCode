package string;

public class PanlindromChecker {

     public static void main(String[] args) {
        String s = "gfg";
        System.out.println( s + "' a palindrome : " + checkPalindrome(s));
    }

    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
