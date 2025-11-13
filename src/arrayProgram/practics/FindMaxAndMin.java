package arrayProgram.practics;

public class FindMaxAndMin {
    public static void main(String[] args) {

        int arr[] = { 3,2,1,5,7,6,8};

         getMaxMin(arr);
    }

    public static void getMaxMin(int arr[]){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : arr){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            }
        System.out.println(max);
        System.out.println(min);
    }
    }

