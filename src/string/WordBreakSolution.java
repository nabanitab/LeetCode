package string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakSolution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        WordBreakSolution solution = new WordBreakSolution();

        // Example usage
        String s1 = "leetcode";
        List<String> wordDict1 = List.of("leet", "code");
        System.out.println(solution.wordBreak(s1, wordDict1)); // Output: true

        String s2 = "applepenapple";
        List<String> wordDict2 = List.of("apple", "pen");
        System.out.println(solution.wordBreak(s2, wordDict2)); // Output: true

        String s3 = "catsandog";
        List<String> wordDict3 = List.of("cats", "dog", "sand", "and", "cat");
        System.out.println(solution.wordBreak(s3, wordDict3)); // Output: false
    }
}
