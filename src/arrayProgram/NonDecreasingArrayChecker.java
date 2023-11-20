package arrayProgram;

public class NonDecreasingArrayChecker {

    public boolean checkPossibility(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;

                if (count > 1) {
                    return false;
                }

                // Check if we can modify nums[i] or nums[i + 1] to fix the violation
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        NonDecreasingArrayChecker checker = new NonDecreasingArrayChecker();

        // Example 1
        int[] nums1 = {4, 2, 3};
        System.out.println(checker.checkPossibility(nums1)); // Output: true

        // Example 2
        int[] nums2 = {4, 2, 1};
        System.out.println(checker.checkPossibility(nums2)); // Output: false
    }
}

