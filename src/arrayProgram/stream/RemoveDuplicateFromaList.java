package arrayProgram.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromaList {

    public static void main(String[] args) {

        List<String>list = Arrays.asList("apple","banana","orrange","banana");

        List<String>output = list.stream().distinct().collect(Collectors.toList());
        System.out.println(output);

       // list.stream().distinct().forEach(System.out::println);

       // list.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
