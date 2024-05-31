package java8;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, write a Java program to filter out the strings that start with the
// letter "a" (case insensitive), capitalize them, and then sort them in alphabetical order.
public class ConvertInUppercaseAndSortInStream {

    public static void main(String[] args) {
        List<String>list = List.of("banana","apple","lemon","avacodo");
        List<String>result = list.stream().filter(s ->s.toLowerCase().startsWith("a"))
                .map(String::toUpperCase)
                        .sorted()
                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
