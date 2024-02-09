package dataStructureByGFG;

public class MaximumCircularSumSubArray {

    static int normalMaxSum(int arr[], int n) {
        int res = arr[0];

        int maxEnding = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }

    static int overallMaxSum(int arr[], int n) {
        int max_normal = normalMaxSum(arr, n);

        if (max_normal < 0)
            return max_normal;

        int arr_sum = 0;

        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];

            arr[i] = -arr[i];
        }

        int max_circular = arr_sum + normalMaxSum(arr, n);

        return Math.max(max_circular, max_normal);
    }


    public static void main(String args[]) {
        int arr[] = {8, -4, 3, -5, 4}, n = 5;

        System.out.println(overallMaxSum(arr, n));

    }
}
