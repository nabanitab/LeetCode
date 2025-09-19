package arrayProgram.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitTheLength {
    public static void main(String[] args) {
        Integer[] arr = {2,5,5,6,3,8};

        Stream<Integer> input = Arrays.stream(arr).limit(3);

        List<Integer>output = input.collect(Collectors.toList());
        System.out.println(output);

    }
}
