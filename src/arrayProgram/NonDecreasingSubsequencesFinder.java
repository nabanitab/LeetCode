package arrayProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonDecreasingSubsequencesFinder {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), result, set);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result, HashSet<String> set) {
        if (current.size() >= 2) {
            String key = current.toString();
            if (!set.contains(key)) {
                result.add(new ArrayList<>(current));
                set.add(key);
            }
        }

        if (index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                current.add(nums[i]);
                backtrack(nums, i + 1, current, result, set);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        NonDecreasingSubsequencesFinder finder = new NonDecreasingSubsequencesFinder();

        int[] nums1 = {4, 6, 7, 7};
        System.out.println("Output 1: " + finder.findSubsequences(nums1));

        int[] nums2 = {4, 4, 3, 2, 1};
        System.out.println("Output 2: " + finder.findSubsequences(nums2));
    }
}

