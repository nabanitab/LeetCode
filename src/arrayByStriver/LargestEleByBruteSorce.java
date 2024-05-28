package arrayByStriver;
//tn = O(n2)
public class LargestEleByBruteSorce {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 22, 31, 6, 55, 89, 90, 91, 1001, 1000};
        System.out.println(findLargestBruteForce(arr));
    }

    public static int findLargestBruteForce(int[] arr) {
        int n = arr.length;
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            boolean isLargest = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLargest = false;
                    break;
                }
            }
            if (isLargest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

