package interview;

import java.util.Arrays;

public class HighestElementInAnArray {
    public static void main(String[] args) {


        int arr[] = {3, 9, 4, 2, 6, 8};


        //assume first element is the largest
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){

            if (arr[i]>max){
                max = arr[i];

            }
        }

        System.out.println(max);

    }
}
