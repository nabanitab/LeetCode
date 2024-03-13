package binarySearch;

public class SearchElementInAArray {
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 6, 7};
        int target = 5;
        System.out.println(binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        //calculates the middle index of the current search interval by adding low to half of
        // the difference between high and low. This is done to avoid integer overflow in case
        // low and high are large integers.
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, search in right half
            if (arr[mid] < target)
                low = mid + 1;

                // If target smaller, search in left half
            else
                high = mid - 1;
        }

        // If target not found, return the index where it should be inserted
        return low;
    }
}
