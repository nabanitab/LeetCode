package arrayProgram;

class SortColors {

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        printArray(nums1);

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        printArray(nums2);
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, current, low);
                current++;
                low++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
