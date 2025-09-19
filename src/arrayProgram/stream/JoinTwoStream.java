package arrayProgram.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinTwoStream {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 1, 4, 7, 10);

        List<Integer> list2 = Arrays.asList(21, 10, 49, 17, 11);

        Stream<Integer>combinedStream = Stream.concat(list1.stream(),list2.stream());

  combinedStream.forEach(System.out::println);
    }
}
