package arrayProgram.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java.util.*;
import java.util.stream.*;

public class Flatmap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("1", "Love", "java"),
                Arrays.asList("2", "rty", "py"),
                Arrays.asList("3", "hate", "ruby")
        );

        // First flatten List<List<String>> -> Stream<String>
        Stream<String> ss = list.stream().flatMap(s -> s.stream());

        // Then just map to uppercase (no need for another flatMap)
        Stream<String> tt = ss.map(String::toUpperCase);

        // Terminal operation to print results
        tt.forEach(System.out::println);
    }
}
