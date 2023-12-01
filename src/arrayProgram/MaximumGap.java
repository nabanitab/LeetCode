package arrayProgram;

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        // Perform Radix Sort
        radixSort(nums);

        // Calculate the maximum gap
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
    }

    private void radixSort(int[] nums) {
        int n = nums.length;
        int maxNum = Arrays.stream(nums).max().getAsInt();

        for (int exp = 1; maxNum / exp > 0; exp *= 10) {
            countingSort(nums, n, exp);
        }
    }

    private void countingSort(int[] nums, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences
        for (int i = 0; i < n; i++) {
            count[(nums[i] / exp) % 10]++;
        }

        // Update count to store the position of the current digit
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(nums[i] / exp) % 10] - 1] = nums[i];
            count[(nums[i] / exp) % 10]--;
        }

        // Copy the output array back to nums
        System.arraycopy(output, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        MaximumGap solution = new MaximumGap();

        int[] nums1 = {3, 6, 9, 1};
        System.out.println("Output 1: " + solution.maximumGap(nums1));

        int[] nums2 = {10};
        System.out.println("Output 2: " + solution.maximumGap(nums2));
    }
}

