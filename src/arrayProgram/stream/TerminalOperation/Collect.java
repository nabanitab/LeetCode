package arrayProgram.stream.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(2, 1, 4, 7, 10);
       List<Integer>output = list.stream().filter((Integer val)->val>=2).collect(Collectors.toList());
        System.out.println(output);

    }
}
