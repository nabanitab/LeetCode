package hashmap;

import java.util.HashMap;

public class FindNumber {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(12, "nabanita");
        hashMap.put(45, "manindra");
        hashMap.put(30, "susmita");

        System.out.println(hashMap.containsKey(45));//true
        System.out.println(hashMap.clone());//{12=nabanita, 45=manindra, 30=susmita}
        System.out.println(hashMap.entrySet());//{12=nabanita, 45=manindra, 30=susmita}
    }
}

