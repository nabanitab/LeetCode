package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

//output is = 1,3
//sum = 4
public class SumOfUniqueElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        Set<Integer> uniqueNumbers = new HashSet<>();
        int sum = sumOfUnique(nums, uniqueNumbers);

        System.out.println("Unique numbers: " + uniqueNumbers);
        System.out.println("Sum of unique numbers: " + sum);
    }

    static int sumOfUnique(int[] nums, Set<Integer> uniqueNumbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // Sum of unique elements (elements with frequency 1)
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
