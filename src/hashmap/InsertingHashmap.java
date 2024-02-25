package hashmap;

import java.util.HashMap;

public class InsertingHashmap {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("nabanita",1);
        map.put("susmita",2);
        map.put("kamal",3);
        map.put("usha",4);

       // int number = map.get("usha");

        String name = map.toString();
        System.out.println(name);

       if(map.containsKey("kamal")){
            System.out.println("kamal is present");
        }

       if(map.containsValue(4)){
           System.out.println("the 4 value is present");
       }

    }
}
