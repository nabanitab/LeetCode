package interview;

import java.util.HashMap;
import java.util.List;

public class StringListToHashMap {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "orange", "grape");

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < stringList.size(); i++) {
            hashMap.put(i, stringList.get(i));
        }

        // Print the HashMap
        System.out.println("HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }
    }
}