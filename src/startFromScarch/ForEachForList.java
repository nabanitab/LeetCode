package startFromScarch;

import java.util.Arrays;
import java.util.List;

public class ForEachForList {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Nabanita", "Asif", "Moumili");

        // forEach with lambda
        names.forEach(name -> System.out.println("Hello " + name));

        // forEach with method reference
        names.forEach(System.out::println);
    }
}


