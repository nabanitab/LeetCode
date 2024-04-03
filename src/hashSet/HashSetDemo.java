package hashSet;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        System.out.println(h.add("a"));
        System.out.println(h.add("a"));//hash set can't have duplicate value ,
        //add method is boolean type .and it won't give any runtime exception instead it will give false

    }
}
