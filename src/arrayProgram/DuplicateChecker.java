package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 9, 10};

        if (containsDuplicate(array)) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}








