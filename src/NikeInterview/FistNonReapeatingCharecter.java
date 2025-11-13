package NikeInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//“Find the first non-repeating character in a string.”
public class FistNonReapeatingCharecter {
    public static void main(String[] args) {
        int arr[] = {2,2,2,4,4,7,3,5};
        System.out.println(getFirstNonRepeatingCharacter(arr));
    }

    public static int getFirstNonRepeatingCharacter(int[] arr){

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Integer,Integer> res : map.entrySet()){
          if(res.getValue()==1){
              return res.getKey();
          }
        }
        return '_';
    }
}
