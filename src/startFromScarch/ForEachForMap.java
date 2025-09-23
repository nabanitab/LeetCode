package startFromScarch;

import java.util.HashMap;

public class ForEachForMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"java");
        map.put(2,"html");
        map.put(3,"springboot");

        map.forEach((key,value)-> System.out.println(map));
    }
}
