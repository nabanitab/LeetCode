package interview;

import java.util.Arrays;

public class TwoSum {

    //0(n^2)
    public static void main(String [] args){

        int arr[] = {5,3,7,2,8};

        int target = 9;

        for (int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

                if (target == arr[i]+arr[j]){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }
}
