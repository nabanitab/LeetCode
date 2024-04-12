package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateEleByStream {
    public static void main(String[] args) {

        ArrayList<Integer>al = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,5));

        List<Integer> result = al.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
