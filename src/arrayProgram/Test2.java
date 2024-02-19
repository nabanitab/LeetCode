package arrayProgram;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,2,1,2,5,6);
        int target = 11;
        duplicateFound(list,target);
    }

    public static void duplicateFound(List<Integer>list, int target){
       // int res = 0;
        for(int i = 0; i<list.size(); i++){
            for(int j = i; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println(list.get(i)+" "+ list.get(j));
                }
              //  System.out.println(list.get(i));
            }
        }


    }
}
