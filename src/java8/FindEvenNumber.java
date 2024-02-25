package java8;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = list.stream().allMatch(n -> n % 2 ==0);
        System.out.println(allEven);
    }
}
