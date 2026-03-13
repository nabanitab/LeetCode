package string.TwoPointer;

import java.util.Arrays;

public class MoveZoroes {

    public static void main(String[] args) {

        int [] arr = {0,2,6,4,8};

        int i = 0;

        for(int j = 0; j<arr.length; j++){
         if(arr[j] != arr[i]){
             int temp = arr[i];
             arr[i]= arr[j];
             arr[j]= temp;
             i++;
         }
        }
        System.out.println(Arrays.toString(arr));
    }
}
