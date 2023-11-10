package arrayProgram;

import java.util.Arrays;

//leetcode :414,an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.


public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        System.out.println(thirdMax(nums1));  // Output: 1

        int[] nums2 = {1, 2};
        System.out.println(thirdMax(nums2));  // Output: 2

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(thirdMax(nums3));  // Output: 1
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                count++;
                if (count == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}
