package LeetCodeProblem;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();

        // Example usage:
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = q1.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices with sum equal to target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }
}
