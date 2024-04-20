package sortingExample.mergeSort;

public class SortTwoArr {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 0, 0, 0, 0}; // Make sure arr1 has enough capacity
        int arr2[] = {2, 4, 6, 8};
        int m = 4; // Length of arr1
        int n = 4; // Length of arr2

        SortTwoArr sorter = new SortTwoArr();
        sorter.merge(arr1, m, arr2, n);

        // Print the merged array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }

    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
}
