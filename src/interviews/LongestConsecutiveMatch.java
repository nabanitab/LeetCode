package interviews;

import java.util.*;

public class LongestConsecutiveMatch {
    public static void main(String[] args) {
        String[] strs1 = {"grey", "pink", "green", "red","abc","black","silver"};
        String[] strs2 = {"grey", "rose red", "white", "pink", "green", "red","xyz","black","silver"};

        List<String> result = longestConsecutiveMatch(strs1, strs2);
        System.out.println(result);
    }

    public static List<String> longestConsecutiveMatch(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        // DP table: dp[i][j] = length of consecutive match ending at arr1[i-1], arr2[j-1]
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0, endIndex = 0; // track longest match

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr1[i - 1].equals(arr2[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i; // ending index in arr1
                    }
                }
            }
        }

        // build result from arr1
        List<String> res = new ArrayList<>();
        for (int i = endIndex - maxLen; i < endIndex; i++) {
            res.add(arr1[i]);
        }
        return res;
    }
}
