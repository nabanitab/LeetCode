package arrayProgram.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,7,13,8,3,9);


       Stream<Integer> input = numbers.stream().filter((Integer num)->num >=2 )
                .peek((Integer num)-> System.out.println(num))
                .map((Integer num)-> (num * -1))
                .sorted();
        List<Integer>filter = input.collect(Collectors.toList());
        System.out.println(filter);
    }
}
