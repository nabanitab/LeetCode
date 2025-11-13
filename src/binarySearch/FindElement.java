package binarySearch;

public class FindElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

    int result = getIndexofTheEle(arr,target);
        System.out.println(result);

    }

    public static int getIndexofTheEle(int[] arr, int target) {

        int low = 0;
        int high = arr.length -1;

        while (low <=high){
            int mid = low+(high-low)/2;

           if (arr[mid]==target){
              return mid;
           }
           if(arr[mid]<target){
                low = mid+1;
           }else {
                high = mid-1;
           }
        }
       return -1;
    }
}