package arrayProgram;

public class MaximumAverageSubarray2 {

    public double findMaxAverage(int[] nums, int k) {
        double low = Integer.MAX_VALUE;
        double high = Integer.MIN_VALUE;

        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low + 1e-5 < high) {
            double mid = low + (high - low) / 2;
            if (check(nums, k, mid)) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private boolean check(int[] nums, int k, double mid) {
        double sum = 0;
        double preSum = 0;
        double minPreSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] - mid;
            if (i >= k - 1) {
                if (sum - minPreSum >= 0) {
                    return true;
                }
                preSum += nums[i - k + 1] - mid;
                minPreSum = Math.min(minPreSum, preSum);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        MaximumAverageSubarray2 solution = new MaximumAverageSubarray2();

        // Example 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Output 1: " + solution.findMaxAverage(nums1, k1)); // Output: 12.75000

        // Example 2
        int[] nums2 = {5};
        int k2 = 1;
        System.out.println("Output 2: " + solution.findMaxAverage(nums2, k2)); // Output: 5.00000
    }
}

