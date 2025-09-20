package string.TwoPointer;

public class PalindromeCheck {
    public static void main(String[] args) {

        String s = "madam";
        int n = s.length();

        int i = 0;
        int j = n - 1;

        boolean isPalindrome = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is NOT a Palindrome");
        }
    }
}
