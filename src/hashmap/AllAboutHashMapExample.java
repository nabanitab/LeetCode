package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AllAboutHashMapExample {
    public static void main(String[] args){

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"nabanita");
        hashMap.put(2,"shreyans");
        hashMap.put(3,"susmita");


        System.out.println(hashMap);

        System.out.println();

        //for printing only key
       Set<Integer>keys= hashMap.keySet();
       for (int i : keys){
           System.out.println(hashMap.get(i));
       }

       //for print both key & value
       Set<Map.Entry<Integer,String>> entries = hashMap.entrySet();
       for(Map.Entry<Integer, String> entry: entries){
           System.out.println(entry.getKey()+" : "+ entry.getValue());
       }

       //value transfrom upper case
       for (Map.Entry<Integer,String>upper :entries){
           upper.setValue(upper.getValue().toUpperCase());
           System.out.println(upper.getKey()+":"+upper.getValue());
       }

    }
}
