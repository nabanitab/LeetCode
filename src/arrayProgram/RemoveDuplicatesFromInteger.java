package arrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromInteger {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 8, 8};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert set to array
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }

        return result;
    }
}
