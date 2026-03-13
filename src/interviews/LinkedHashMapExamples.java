package interviews;

import java.util.LinkedHashMap;

public class LinkedHashMapExamples {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        System.out.println(map);
        // {3=Apple, 1=Banana, 2=Cherry} → insertion order maintained

        map.get(1);  // access key 1
        System.out.println(map);
        // still same order unless accessOrder=true
    }
    }

