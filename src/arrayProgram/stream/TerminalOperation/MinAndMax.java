package arrayProgram.stream.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find the minimum and Maximum elements from the stream based on the comparator
public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 10);


        Optional<Integer>minimumVal = list.stream().filter((Integer num)->num>=3)
                .min((Integer val1,Integer val2)->val1-val2);//based on comparator,natural order,

        System.out.println(minimumVal.get());
    }
}
