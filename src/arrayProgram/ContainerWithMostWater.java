package arrayProgram;

//You are given an array height representing the heights of vertical lines on a plane. The width of each line is 1. Compute the maximum area of water that can be contained between two vertical lines.
//
//The maxArea method takes an array of integers height as input, where height[i] is the height of the line at index i. The method should return an integer representing the maximum area of water that can be trapped.
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, h * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Example Test Case
        int[] testHeight = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(testHeight);
        System.out.println("Maximum area of water: " + result);
    }
}
