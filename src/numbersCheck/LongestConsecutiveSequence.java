package numbersCheck;

import java.util.HashSet;

//leetCode :128
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store unique elements from the array
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the array to find the start of a sequence
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Iterate to find the consecutive elements in the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the longest streak if the current streak is longer
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Test Case 1: " + longestConsecutive(nums1));  // Output: 4

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Test Case 2: " + longestConsecutive(nums2));  // Output: 9
    }
}

