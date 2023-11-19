package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = j + map.get(list2[j]);
                if (indexSum < minIndexSum) {
                    result.clear();
                    result.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists solution = new MinimumIndexSumOfTwoLists();

        // Example 1
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result1 = solution.findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result1)); // Output: ["Shogun"]

        // Example 2
        String[] list3 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list4 = {"KFC", "Shogun", "Burger King"};
        String[] result2 = solution.findRestaurant(list3, list4);
        System.out.println(Arrays.toString(result2)); // Output: ["Shogun"]

        // Example 3
        String[] list5 = {"happy", "sad", "good"};
        String[] list6 = {"sad", "happy", "good"};
        String[] result3 = solution.findRestaurant(list5, list6);
        System.out.println(Arrays.toString(result3)); // Output: ["sad", "happy"]
    }
}

