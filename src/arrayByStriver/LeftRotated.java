package arrayByStriver;

public class LeftRotated {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 8};
        arr = getLeftRotated(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] getLeftRotated(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
