package testInterview;

public class Test {
    public static void main(String[] args) {

        int arr[] = {2,3,5,22,31,6,55,89,90,91,1001,1000};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr){

        int firstLargestEle = Integer.MIN_VALUE;
        int secondLargestEle = Integer.MIN_VALUE;

        for (int num:arr
             ) {
            if(num>firstLargestEle){
               secondLargestEle= firstLargestEle;
               firstLargestEle= num;
            } else if (num>secondLargestEle && num!=firstLargestEle ) {
                secondLargestEle=num;
            }
        }
        return secondLargestEle;
    }
}
