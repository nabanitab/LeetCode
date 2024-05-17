package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Out put : [4, 3, 2, 1]
public class SortAndRemovedDuplicateElementInDsc {
    public static void main(String[] args) {

        ArrayList<Integer>al = new ArrayList<>(Arrays.asList(2,4,3,4,1,2,3,4,3));

        List<Integer> result = al.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
