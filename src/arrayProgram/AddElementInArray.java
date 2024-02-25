package arrayProgram;

public class AddElementInArray {

    public static void main(String[] args) {

         int arr[] = {2,4,9,4,9};
        System.out.println(getSumOfEveryElement(arr));
    }

    public static int getSumOfEveryElement(int [] arr){

        int sum = 0;

        for (int res:arr
             ) {
            sum = sum+res;
        }
        return sum;
    }
}
