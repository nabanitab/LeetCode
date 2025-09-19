package arrayProgram.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToInt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2", "3", "5", "9", "6");

        // Convert String -> int
        IntStream intStream = list.stream()
                .mapToInt(Integer::parseInt);

        // Convert IntStream to int[]
        int[] numberArray = intStream.toArray();

        // Print results
        System.out.println(Arrays.toString(numberArray));
    }
}
