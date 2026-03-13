package interview;

import coreJava.inheritance.P;

import java.util.Arrays;

public class SecondHighestInArray {
    public static  void main(String[] args){

        int arr[] = {2,6,1,8,5};

        Arrays.sort(arr);//assending order

        int n = arr.length;

        int largest = arr[n-1];

        int secomdLargest = Integer.MIN_VALUE;

        for(int i = n-2; i>=0; i--){
            if (arr[i] != largest) {
                secomdLargest = arr[i];
                break;

            }
        }
        System.out.println(secomdLargest);

    }
}
