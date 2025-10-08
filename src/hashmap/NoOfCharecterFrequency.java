package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NoOfCharecterFrequency {

    public static void main(String[] args){

        String s = "nabanita";

        HashMap<Character,Integer>map = new HashMap<>();

        for (char c : s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }

    }
}
