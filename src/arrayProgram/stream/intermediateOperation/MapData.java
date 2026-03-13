package arrayProgram.stream.intermediateOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//use to transform each element
public class MapData {
    public static void main(String[] args) {


        Stream<String> stringStream = Stream.of("hellow","everybody","how","are","you","doing");

        Stream<String>filterMap = stringStream.map(String::toUpperCase);
      //filterMap.forEach(System.out::println);
        List<String>output = filterMap.collect(Collectors.toList());
        System.out.println(output);

    }
}
