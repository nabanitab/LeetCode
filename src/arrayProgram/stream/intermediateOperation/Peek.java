package arrayProgram.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//help to see the intermediate result of the stream which is getting processed
public class Peek {
    public static void main(String[] args) {

        List<Integer>numbers = Arrays.asList(2,5,5,6,3,8) ;

        Stream<Integer>numberStream = numbers.stream().filter((Integer val)-> val>2).peek((Integer val)-> System.out.println(val)).map((Integer val)-> -1*val);
        List<Integer>integerList = numberStream.collect(Collectors.toList());
        System.out.println(integerList);
    }
}
