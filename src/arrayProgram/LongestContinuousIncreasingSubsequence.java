package arrayProgram;

public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence solution = new LongestContinuousIncreasingSubsequence();

        // Example 1
        int[] nums1 = {1, 3, 5, 4, 7};
        int result1 = solution.findLengthOfLCIS(nums1);
        System.out.println("Output 1: " + result1); // Output: 3

        // Example 2
        int[] nums2 = {2, 2, 2, 2, 2};
        int result2 = solution.findLengthOfLCIS(nums2);
        System.out.println("Output 2: " + result2); // Output: 1
    }
}

