package interview;

import java.util.HashSet;

public class MapTwoDifferentArray {
    public static void main(String[] args) {
        int arr [] ={7,4,2,8,5};
        int key = 8;

        System.out.println(getElement(arr,key));
    }

    public static int getElement(int[] arr, int key){

        HashSet<Integer>set = new HashSet<>();

       /* for (int num: arr
             ) {
            set.add()
        }*/

        for (int i = 0; i<arr.length; i++){

            if(key == arr[i]){
                return key;
            }

        }
        return -1;
    }
}
