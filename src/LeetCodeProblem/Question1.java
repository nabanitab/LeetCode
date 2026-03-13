package LeetCodeProblem;

import java.util.HashMap;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
/*
“I’m using a HashMap to store numbers I’ve seen so far and their indices.
For each element, I compute the difference target - nums[i].
If that difference already exists in the map, it means I’ve found the two numbers whose sum equals the target, so I return their indices.
If not, I store the current number with its index in the map and continue.”
 */
        HashMap<Integer,Integer>map = new HashMap<>();


        for(int i =0; i<nums.length; i++){
            //For each element, I compute the difference target - nums[i]
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
        }

        return new int[0];

    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();

        // Example usage:
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = q1.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices with sum equal to target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }
}
