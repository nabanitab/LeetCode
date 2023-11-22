package arrayProgram;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class IntersectionOfArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionOfArrays solution = new IntersectionOfArrays();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = solution.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result1)); // Output: [2]

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = solution.intersection(nums3, nums4);
        System.out.println(Arrays.toString(result2)); // Output: [9, 4]
    }
}
