package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("kolkata", "karnataka", "andhra", "arunachal");

        List<String> filteredWords = list.stream()
                .filter(s -> s.startsWith("k"))
                .collect(Collectors.toList());

        System.out.println("Words starting with 'k': " + filteredWords);
    }
}


