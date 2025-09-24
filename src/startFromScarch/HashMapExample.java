package startFromScarch;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {


        int arr[] = {3, 5, 6, 7, 8};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1 );
        }
        System.out.println(map);
    }
}
