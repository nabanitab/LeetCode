package java8;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterOdd {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 9));

        int result = list.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
