package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//["10", "abc", "30", "xyz", "40"]
public class Numericfound {

    static void main() {
        List<String> numaricInput = Arrays.asList("10", "abc", "30", "xyz", "40");

        List<String> output = numaricInput.stream().filter(s-> s.chars().allMatch(Character:: isDigit))
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
