package arrayProgram;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining positions with zeroes
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes mover = new MoveZeroes();

        // Test case
        int[] nums = {0, 1, 0, 3, 12};
        mover.moveZeroes(nums);

        // Output: [1, 3, 12, 0, 0]
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

