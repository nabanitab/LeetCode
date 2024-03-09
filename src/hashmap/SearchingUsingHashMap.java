package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SearchingUsingHashMap {

    public static void main(String[] args) {

        String s = new String("nabanita");

        System.out.println(getName(s));

    }

    public static int getName(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        for (Character chr: s.toCharArray()
             ) {
            map.put( chr,map.getOrDefault(chr,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
