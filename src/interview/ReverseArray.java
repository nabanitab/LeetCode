package interview;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        int arr[] = {2,5,7,8};

        //creating new array with same input array length
        int newCreatedArray[] = new int[arr.length];

        int j= 0;
        for (int i = arr.length-1; i >= 0; i--) {

            newCreatedArray[j++] = arr[i];// fill reversed values
        }
            System.out.println(Arrays.toString(newCreatedArray));
        }
    }

