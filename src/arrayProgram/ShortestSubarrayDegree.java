package arrayProgram;

import java.util.HashMap;

public class ShortestSubarrayDegree {
    public int findShortestSubarray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        int maxCount = Integer.MIN_VALUE;
        for (int j : count.keySet()) {
            maxCount = Math.max(maxCount, count.get(j));
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int windowSize = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (j < nums.length) {
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            windowSize = Math.max(windowSize, hm.get(nums[j]));
            while (windowSize == maxCount) {
                res = Math.min(res, j - i + 1);
                hm.put(nums[i], hm.get(nums[i]) - 1);
                if (hm.get(nums[i]) == 0)
                    hm.remove(nums[i]);
                if (nums[i] == nums[j])
                    windowSize--;
                i++;
            }
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        ShortestSubarrayDegree solution = new ShortestSubarrayDegree();

        // Example 1
        int[] nums1 = {1, 2, 2, 3, 1};
        int result1 = solution.findShortestSubarray(nums1);
        System.out.println("Output 1: " + result1); // Output: 2

        // Example 2
        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
        int result2 = solution.findShortestSubarray(nums2);
        System.out.println("Output 2: " + result2); // Output: 6
    }
}

