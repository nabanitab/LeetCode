package hashmap;

import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 7, 3, 8, 6};
        int target = 10;
        HashMap<Integer, Integer> result = getTargetSum(arr, target);
        System.out.println("Pairs that sum up to " + target + ": " + result);
    }

    public static HashMap<Integer, Integer> getTargetSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i : arr) {
            int complement = target - i;
            if (map.containsKey(complement)) {
                result.put(i, complement);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return result;
    }
}
