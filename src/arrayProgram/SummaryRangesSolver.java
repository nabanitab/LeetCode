package arrayProgram;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesSolver {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            if (start == end) {
                result.add(Integer.toString(start));
            } else {
                result.add(start + "->" + end);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SummaryRangesSolver solver = new SummaryRangesSolver();

        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println("Output 1: " + solver.summaryRanges(nums1));

        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        System.out.println("Output 2: " + solver.summaryRanges(nums2));
    }
}

