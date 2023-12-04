package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolver {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++; // Skip duplicates
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--; // Skip duplicates
                    }

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSumSolver solver = new ThreeSumSolver();

        // Example 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Output 1: " + solver.threeSum(nums1));

        // Example 2
        int[] nums2 = {0, 1, 1};
        System.out.println("Output 2: " + solver.threeSum(nums2));

        // Example 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Output 3: " + solver.threeSum(nums3));
    }
}

