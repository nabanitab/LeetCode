package arrayProgram;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = {8, 4, 2, 9, 7, 5, 1, 3, 6};

        int secondSmallest = findSecondSmallest(array);

        System.out.println("Second Smallest Element: " + secondSmallest);
    }

    static int findSecondSmallest(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array doesn't have enough elements.");
            return -1; // or handle the case accordingly
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}

