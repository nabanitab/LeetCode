package string;

public class ShortestPalindromeSolver {

    public String shortestPalindrome(String s) {
        int n = s.length();
        int[] lps = new int[n];

        for (int i = 1, j = 0; i < n; ) {
            if (s.charAt(i) == s.charAt(j)) {
                lps[i++] = ++j;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                lps[i++] = 0;
            }
        }

        int len = n - lps[n - 1];
        String prefix = s.substring(len);
        return new StringBuilder(prefix).reverse().toString() + s;
    }

    public static void main(String[] args) {
        ShortestPalindromeSolver solver = new ShortestPalindromeSolver();

        // Example usage
        String s1 = "aacecaaa";
        System.out.println(solver.shortestPalindrome(s1)); // Output: "aaacecaaa"

        String s2 = "abcd";
        System.out.println(solver.shortestPalindrome(s2)); // Output: "dcbabcd"
    }
}

