package string;

//leetcode string: 125
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

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

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(test1));  // Output: true

        String test2 = "race a car";
        System.out.println(solution.isPalindrome(test2));  // Output: false

        String test3 = " ";
        System.out.println(solution.isPalindrome(test3));  // Output: true
    }
}

