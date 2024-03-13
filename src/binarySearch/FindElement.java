package binarySearch;

public class FindElement {
    public static void main(String[] args) {
        int arr [] = {2,3,4,5,6,7,8,9};
        int target = 7;
        int result = getElement(arr,target);
        System.out.println("Element found : "+result);
    }
    public static int getElement(int[] arr, int target){
        int low = 0;

        int high = arr.length -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==low){
                return mid;
            }

            if(arr[mid]==high){
                low= mid+1;
            }
            else
                high = mid-1;
        }
        return -1;
    }
}

