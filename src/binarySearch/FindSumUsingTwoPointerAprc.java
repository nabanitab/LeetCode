package binarySearch;

//sum of two element in sorted array
//t.c- O(n)
//aux - O(1)
public class FindSumUsingTwoPointerAprc {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 30};
        int x = 17;
        int n = arr.length;
        System.out.println(isPair(arr, n, x));
    }

    private static boolean isPair(int[] arr, int n, int x) {
        int i = 0, j = n - 1;
        while (i <= j) {
            if (arr[i] + arr[j] == x)
                return true;
            else if (arr[i] + arr[j] < x)
                i++;
            else
                j--;
        }
        return false;
    }
}
