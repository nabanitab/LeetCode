package arrayProgram;

public class RangeSumQuery {
    private int[] prefixSum;

    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int calculateSumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);

        // Test cases
        System.out.println(rangeSumQuery.calculateSumRange(0, 2)); // Output: 1
        System.out.println(rangeSumQuery.calculateSumRange(2, 5)); // Output: -1
        System.out.println(rangeSumQuery.calculateSumRange(0, 5)); // Output: -3
    }
}
