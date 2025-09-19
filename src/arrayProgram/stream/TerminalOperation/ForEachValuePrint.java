package arrayProgram.stream.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class ForEachValuePrint {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 1, 4, 7, 10);

        list.stream()
                .filter(value -> value >= 3)   // keep values >= 3
                .forEach(System.out::println); // print each
    }
}
