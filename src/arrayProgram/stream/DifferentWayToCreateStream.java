package arrayProgram.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferentWayToCreateStream {
    public static void main(String[] args) {

        //1. From collection
        List<Integer> list = Arrays.asList(3000, 4000, 1000, 9000, 35000);
        Stream<Integer> stream = list.stream();

        // 2. From ArrayList

        Integer[] salaryArray = {3000, 4000, 1000, 9000, 35000};
        Stream<Integer> stream1 = Arrays.stream(salaryArray);

        //3.From static method

        Stream<Integer> streamFromStaticMethod = Stream.of(3000, 4000, 1000, 9000, 35000);

        //4.From stream builder method
        Stream.Builder<Integer>streamBuilder = Stream.builder();
        streamBuilder.add(1000).add(900).add(3500);

        Stream<Integer>s = streamBuilder.build();

        //5.From stream literate
        Stream<Integer>stream2 = Stream.iterate(1000,(Integer n)-> n+5000).limit(5);
    }
}
