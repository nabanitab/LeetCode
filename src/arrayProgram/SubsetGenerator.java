package arrayProgram;

import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubsetGenerator subsetGenerator = new SubsetGenerator();
        int[] nums1 = {1, 2, 3};
        System.out.println(subsetGenerator.subsets(nums1));

        int[] nums2 = {0};
        System.out.println(subsetGenerator.subsets(nums2));
    }
}

