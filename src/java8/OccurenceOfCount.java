package java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//jasmine, rose, lotus, lilly, jasmine, rose, rose
public class OccurenceOfCount {

    public static void main(String[] args) {

  /*     List<String> flowers = Arrays.asList("jasmine", "rose", "lotus", "lilly", "jasmine", "rose", "rose");

       Map<String,Long> repeated= flowers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       Optional<Map.Entry<String,Long>>  output = repeated.entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(output);*/

/*        String mostFrequent = flowers.stream()
                .max(Comparator.comparingInt(f -> Collections.frequency(flowers, f)))
                .orElse(null);
        System.out.println(mostFrequent);*/

    }
}
