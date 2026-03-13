public class Expl {



    //Output: 5, nums = [1,1,2,2,3,_]

    //Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each
    // unique element appears at most twice. The relative order of the elements should be kept the same.

    //Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).

    public static  int  removeDuplicate(int[] nums){
        if(nums.length <=2) return  nums.length;
        int k = 2;

        for(int i = 2; i<nums.length; i++){

           // System.out.println("Array travase");
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String args[]){
        int[] nums = {0,0,1,1,1,1,2,3,3};

        int k = removeDuplicate(nums);
        System.out.println("k =  "+k);
        System.out.println("Result array = ");

        for(int i = 0; i<k;i++){
            System.out.println(nums[i]+ (i<k-1 ? "," : ""));

        }
        System.out.println("]");
    }
}
