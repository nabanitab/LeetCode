package arrayByStriver;

import java.util.Arrays;

//in array last index is length -1;
//tn = (O(n log n))
public class LargestElementBestSolution {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 22, 31, 6, 55, 89, 90, 91, 1001, 1000};
        System.out.println(getLargestElementBestSoln(arr));
    }

    public static int getLargestElementBestSoln(int arr[]) {

        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
