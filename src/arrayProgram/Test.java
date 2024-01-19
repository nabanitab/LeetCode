package arrayProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
       int [] input = {8,1,2,2,3};// op {4,0,1,1,3}

       Map<Integer,Integer> m=firstRepetativeChar(input);
        System.out.println(m);
       // System.out.println(Arrays.toString(r));

        }
public static Map<Integer,Integer> firstRepetativeChar(int[] input){

        Map<Integer,Integer> result = new LinkedHashMap<>();
        for( int i = 0; i<input.length; i++){
            int count = 0;
            for(int j = 0; j<input.length;j++){
                if(input[i]>input[j]){

                    count++;
                    //break;
                }
                result.put(input[i], count);

            }
        }
    return result;
}
}
