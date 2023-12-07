package arrayProgram;

import java.util.Arrays;

class PartitionKSubsetsSolver {
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % k != 0) {
            return false;
        }

        int target = sum / k;
        boolean[] visited = new boolean[nums.length];
        return canPartition(nums, k, 0, 0, target, visited);
    }

    private static boolean canPartition(int[] nums, int k, int start, int currentSum, int target, boolean[] visited) {
        if (k == 0) {
            return true;
        }

        if (currentSum == target) {
            return canPartition(nums, k - 1, 0, 0, target, visited);
        }

        for (int i = start; i < nums.length; i++) {
            if (!visited[i] && currentSum + nums[i] <= target) {
                visited[i] = true;
                if (canPartition(nums, k, i + 1, currentSum + nums[i], target, visited)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {4, 3, 2, 3, 5, 2, 1};
        int k1 = 4;
        System.out.println(canPartitionKSubsets(nums1, k1));

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        int k2 = 3;
        System.out.println(canPartitionKSubsets(nums2, k2));
    }
}
