package basic;

import leetcode2025.TwoSum;

public class MyClass {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 9, 6};

       /*
       for array if we want to find the value than will do arr[i],
       if we want to find the index of the value we will do i;

       1. int missingNum = 8;

       //linear search

       for(int i = 0; i<arr.length; i++){

           if(missingNum == arr[i]){

               System.out.println(i);

           }

       }*/
/*
       2. sum of array
        int sum = 0;

        for (int i = 0; i<arr.length; i++){

            sum = sum + arr[i];
            System.out.println(sum);

        }*/
/*
     3. Maximum number in an array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);

*/
        int[] result = getSumofTwoElement(arr);
        if (result != null) {
            System.out.println("TwoSum result: Index1 = " + result[0] + ", Index2 = " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }

    }

    public static int[] getSumofTwoElement(int[] arr) {
        int twoSum = 6;


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + i; j < arr.length; j++) {

                if (arr[i] + arr[j] == twoSum) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}

