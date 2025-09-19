package arrayProgram.stream.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class findFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> firstElement = list.stream().filter((Integer num)->num>=3)
                .findFirst();

        System.out.println(firstElement.get());

   }
}
