package string;

public class DecodeWays {

    public static class Solution {
        public int numDecodings(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            int n = s.length();
            int[] dp = new int[n + 1];
            dp[0] = 1;

            for (int i = 1; i <= n; i++) {
                if (s.charAt(i - 1) != '0') {
                    dp[i] += dp[i - 1];
                }

                if (i > 1 && isValid(s.substring(i - 2, i))) {
                    dp[i] += dp[i - 2];
                }
            }

            return dp[n];
        }

        private boolean isValid(String s) {
            int num = Integer.parseInt(s);
            return num >= 10 && num <= 26;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        String s1 = "12";
        System.out.println("Ways to decode '" + s1 + "': " + solution.numDecodings(s1));

        String s2 = "226";
        System.out.println("Ways to decode '" + s2 + "': " + solution.numDecodings(s2));

        String s3 = "06";
        System.out.println("Ways to decode '" + s3 + "': " + solution.numDecodings(s3));
    }
}

