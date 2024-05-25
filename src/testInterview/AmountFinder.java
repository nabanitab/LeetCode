package testInterview;

public class AmountFinder {
    public static void main(String[] args) {
        int arr[] = {1, 5, 10, 20, 50, 100, 200, 500, 2000};
        int amount = 800;

        int result = getAmount(arr, amount);
        System.out.println("Minimum coins/notes required: " + result);
    }

    public static int getAmount(int arr[], int amount) {
        int count = 0;

        // Start from the largest denomination
        for (int i = arr.length - 1; i >= 0; i--) {
            if (amount >= arr[i]) {
                count += amount / arr[i]; // Use as many of this denomination as possible
                amount %= arr[i]; // Reduce the amount by the used value
            }
        }

        // If amount is not zero here, it means it's not possible to form the exact amount with given denominations
        if (amount != 0) {
            return -1;
        }

        return count;
    }
}

