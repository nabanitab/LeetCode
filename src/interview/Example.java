package interview;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<String> lists= List.of("ram", "sb", "hari", "dc", "neha", "ad", "ram", "e", "shrawan", "df", "ram");



        List<String> list = lists.stream().filter(e -> e.startsWith("a", 1)).collect(Collectors.toList());
        System.out.println(list);
    }
}