package arrayProgram;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                maxLen = Math.max(maxLen, countMap.get(num) + countMap.get(num + 1));
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();

        // Example 1
        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println("Output 1: " + solution.findLHS(nums1)); // Output: 5

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Output 2: " + solution.findLHS(nums2)); // Output: 2

        // Example 3
        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Output 3: " + solution.findLHS(nums3)); // Output: 0
    }
}
