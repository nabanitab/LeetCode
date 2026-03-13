import java.util.*;

public class FourSum {
    //Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
    //
    //Note:
    //
    //The solution set must not contain duplicate quadruplets.
    //
    //Example:
    //
    //Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
    //
    //A solution set is:
    //[
    //  [-1,  0, 0, 1],
    //  [-2, -1, 1, 2],
    //  [-2,  0, 0, 2]
    //]
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();


        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                result.add(Arrays.asList(compliment, nums[i]));

            }

            map.put(nums[i], i);
        }
        return  result;
    }

    static void main() {
        int [] nums = {1, 0, -1, 0, -2, 2};

        int target = 0;

        List<List<Integer>> res = fourSum(nums, target);
        System.out.println(res);
    }

}
