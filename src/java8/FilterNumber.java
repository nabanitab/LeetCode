package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumber {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(5, 10, 59, 789, 45, 20);

        List<Integer> integerList = list.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
