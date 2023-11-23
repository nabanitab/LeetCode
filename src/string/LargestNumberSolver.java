package string;

import java.util.Arrays;

public class LargestNumberSolver {

    public String findLargestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));

        if (numsStr[0].equals("0")) {
            return "0"; // If the largest number is 0, the result should be "0"
        }

        StringBuilder result = new StringBuilder();
        for (String numStr : numsStr) {
            result.append(numStr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LargestNumberSolver solver = new LargestNumberSolver();

        // Example usage
        int[] nums1 = {10, 2};
        System.out.println(solver.findLargestNumber(nums1)); // Output: "210"

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(solver.findLargestNumber(nums2)); // Output: "9534330"
    }
}

