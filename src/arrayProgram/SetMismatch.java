package arrayProgram;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result[0] = index + 1;
            } else {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SetMismatch solution = new SetMismatch();

        // Example 1
        int[] nums1 = {1, 2, 2, 4};
        int[] result1 = solution.findErrorNums(nums1);
        System.out.println("Output 1: [" + result1[0] + ", " + result1[1] + "]"); // Output: [2, 3]

        // Example 2
        int[] nums2 = {1, 1};
        int[] result2 = solution.findErrorNums(nums2);
        System.out.println("Output 2: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]
    }
}

