package LeetCodeProblem;

//qstn : hashtable(2206)

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoPairs {
    public static boolean canDivideIntoPairs(int[] nums) {
        if (nums.length % 2 != 0) {
            return false; // If the number of elements is odd, cannot form pairs
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if each number can form pairs
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) % 2 != 0) {
                return false; // If the frequency of any number is odd, cannot form pairs
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3, 2, 2, 2};
        System.out.println(canDivideIntoPairs(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(canDivideIntoPairs(nums2)); // Output: false
    }
}
