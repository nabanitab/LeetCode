package arrayProgram;

//Problem Statement:
//You are given an array of integers and an integer k. Your task is to find the maximum sum
// of any contiguous subarray of size k within the given array.
//
//For example, consider the array [1, 3, -1, -3, 5, 3, 6, 7] and k equals 3.
// The contiguous subarrays of size 3 are [1, 3, -1], [3, -1, -3], [-1, -3, 5], [-3, 5, 3], [5, 3, 6], and [3, 6, 7]. The maximum sum among these subarrays is 16, which corresponds to the subarray [3, 6, 7].
public class SlidingWindow {
    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Slide the window and calculate the maximum sum
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Add the next element and remove the leftmost element of the window
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int maxSum = maxSumSubarray(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum);
    }
}

