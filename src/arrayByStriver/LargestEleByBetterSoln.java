package arrayByStriver;

public class LargestEleByBetterSoln {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 22, 31, 6, 55, 89, 90, 91, 1001, 1000};
        System.out.println(findLargestBetter(arr));
    }

    public static int findLargestBetter(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}
