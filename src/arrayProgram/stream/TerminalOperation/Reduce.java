package arrayProgram.stream.TerminalOperation;

//does reduction on the elements of the stream.
// Perform associative aggregation function

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 10);

        //2+1 =3,
        //3+4 = 7
        //7+7=14
        //14+10=24
        Optional<Integer> reduceValue = list.stream().reduce((Integer v1, Integer v2) -> v1 + v2);
        System.out.println(reduceValue.get());
    }
}
