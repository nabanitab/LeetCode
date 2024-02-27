package arrayProgram;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such
// that nums[i] == nums[j] and abs(i - j) <= k.
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {

        ContainsNearbyDuplicate solution = new ContainsNearbyDuplicate();

        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int k3 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3)); // Output: true
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (numIndexMap.containsKey(num) && i - numIndexMap.get(num) <= k) {
                // If the number is already in the map and the indices have a difference less than or equal to k
                return true;
            }

            numIndexMap.put(num, i);
        }
        // No nearby duplicates found
        return false;
    }
}

