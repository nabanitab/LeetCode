package arrayProgram.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//skip the first n element
public class SkipFirstNElement {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(2,5,5,6,3,8) ;

       List<Integer>output= numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println(output);
    }
}
