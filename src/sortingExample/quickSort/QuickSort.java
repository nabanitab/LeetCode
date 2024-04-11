package sortingExample.quickSort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = arr[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // Move left pointer until you find an element greater than the pivot
            while (arr[i] < pivot) {
                i++;
            }
            // Move right pointer until you find an element less than the pivot
            while (arr[j] > pivot) {
                j--;
            }
            // Swap elements, and move both pointers
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        // Recursively sort the two sub-arrays
        if (low < j) {
            sort(arr, low, j);
        }
        if (i < high) {
            sort(arr, i, high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 8, 1, 3, 9, 4, 7, 5 };
        QuickSort qs = new QuickSort();
        qs.quickSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
