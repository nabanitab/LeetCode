package interviews;

public class HighestElementReplace {

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int[] modifiedArray = getHighestReplaceNumber(arr);
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] getHighestReplaceNumber(int arr[]) {
        int highestElement = arr[arr.length - 1]; // Initialize highest element as the last element
        int[] modifiedArray = new int[arr.length]; // Create a new array to store modified elements

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // If current element is smaller than or equal to the highest element to its right
            if (arr[i] <= highestElement) {
                modifiedArray[i] = highestElement; // Replace with the highest element to its right
            } else {
                highestElement = arr[i]; // Update the highest element
                modifiedArray[i] = arr[i]; // Keep the original element
            }
        }
        return modifiedArray;
    }
}

