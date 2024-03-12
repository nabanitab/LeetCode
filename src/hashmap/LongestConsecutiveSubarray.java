package hashmap;

import java.util.HashMap;

public class LongestConsecutiveSubarray {

    public static void main(String[] args) {
        int arr [] = {1,2,3,5,7,8,9};

        int result = getLongestSubsequence(arr);
        System.out.println("Length of the longest consecutive subarray: " + result);
    }

    public static int getLongestSubsequence(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLength = 0;
        for (int i :arr) {
           if(!map.containsKey(i)){
              int leftLength = map.getOrDefault(i, 0+1);
              int rightLength = map.getOrDefault(i,0-1);
               int totalLength = leftLength + rightLength + 1;

               map.put(i, totalLength);
               map.put(i - leftLength, totalLength);
               map.put(i + rightLength, totalLength);

               maxLength = Math.max(maxLength, totalLength);
           }
        }
        return maxLength;
    }
}
