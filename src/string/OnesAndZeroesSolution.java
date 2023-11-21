package string;

public class OnesAndZeroesSolution {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];

        for (int i = 1; i <= strs.length; i++) {
            int[] counts = countZerosOnes(strs[i - 1]);
            int zeros = counts[0];
            int ones = counts[1];

            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    // Case 1: Exclude the current string
                    dp[i][j][k] = dp[i - 1][j][k];

                    // Case 2: Include the current string if there are enough 0's and 1's
                    if (j >= zeros && k >= ones) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - zeros][k - ones] + 1);
                    }
                }
            }
        }

        return dp[strs.length][m][n];
    }

    private int[] countZerosOnes(String str) {
        int[] counts = new int[2];
        for (char ch : str.toCharArray()) {
            counts[ch - '0']++;
        }
        return counts;
    }

    public static void main(String[] args) {
        OnesAndZeroesSolution solution = new OnesAndZeroesSolution();

        // Example 1
        String[] strs1 = {"10", "0001", "111001", "1", "0"};
        int m1 = 5;
        int n1 = 3;
        System.out.println(solution.findMaxForm(strs1, m1, n1)); // Output: 4

        // Example 2
        String[] strs2 = {"10", "0", "1"};
        int m2 = 1;
        int n2 = 1;
        System.out.println(solution.findMaxForm(strs2, m2, n2)); // Output: 2
    }
}
