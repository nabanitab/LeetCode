package arrayProgram;

public class IncreasingTripletSolution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        IncreasingTripletSolution solution = new IncreasingTripletSolution();

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Output 1: " + solution.increasingTriplet(nums1));

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Output 2: " + solution.increasingTriplet(nums2));

        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println("Output 3: " + solution.increasingTriplet(nums3));
    }
}

