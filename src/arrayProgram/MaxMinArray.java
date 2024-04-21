package arrayProgram;

public class MaxMinArray {
    public static void main(String[] args) {

        int[] array = {3, 1, 9, 4, 6, 8, 2, 7, 5};

        // Function call to find max and min
        findMaxMin(array);
    }

    static void findMaxMin(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}

