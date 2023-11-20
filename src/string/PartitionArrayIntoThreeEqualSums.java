package string;

public class PartitionArrayIntoThreeEqualSums {

    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 3 != 0) {
            return false;
        }

        int targetSum = totalSum / 3;
        int i = 0, j = arr.length - 1;
        int sumLeft = 0, sumMiddle = 0;

        while (i < j) {
            if (sumLeft != targetSum) {
                sumLeft += arr[i];
                i++;
            }

            if (sumMiddle != targetSum) {
                sumMiddle += arr[j];
                j--;
            }

            if (sumLeft == targetSum && sumMiddle == targetSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        PartitionArrayIntoThreeEqualSums solution = new PartitionArrayIntoThreeEqualSums();

        // Example 1
        int[] arr1 = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        System.out.println(solution.canThreePartsEqualSum(arr1)); // Output: true

        // Example 2
        int[] arr2 = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        System.out.println(solution.canThreePartsEqualSum(arr2)); // Output: false

        // Example 3
        int[] arr3 = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        System.out.println(solution.canThreePartsEqualSum(arr3)); // Output: true
    }
}
