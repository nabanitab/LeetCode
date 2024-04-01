package java8;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWordWithA {

    public static void main(String[] args) {
        List<String> list = List.of("ram", "sb", "hari", "dc", "neha", "ad", "ram", "e", "shrawan", "df", "ram");

        List<String>result = list.stream().filter(e ->e.startsWith("a",1)).collect(Collectors.toList());

        System.out.println(result);
    }
}
