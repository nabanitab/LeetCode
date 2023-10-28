package arrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfThreeArray {
    public static void main(String[] args) {
        int [] array1 = {2,4,6,8,9};
        int [] array2 = {4,8,9,2,4};
        int [] array3 = {7,3,0,54,2};

        int sumArrays[] = sumArrays(array1,array2,array3);
        System.out.printf("Sum of the arrays :"+ Arrays.toString(sumArrays));
    }

    private static int[] sumArrays(int[]array1,int[]array2,int[]array3){
        int length = array1.length;
        int[] sumArray = new int[length] ;

        for (int i=0;i<length;i++){
            sumArray[i] = array1[i] + array2[i] +array3[i];
        }
        return sumArray;
    }
}
