package arrayProgram.stream.intermediateOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//filter, intermediate operation.It filters the output
public class FilterSameLength {
    public static void main(String[] args) {

        Stream<String>stringStream = Stream.of("Hello","Everybody","how","are","you","doing");

        Stream<String>filterStream  = stringStream.filter((String name)-> name.length()<=3);

        //.collect is terminal operator
        List<String>output = filterStream.collect(Collectors.toList());
        System.out.println(output);

    }
}
