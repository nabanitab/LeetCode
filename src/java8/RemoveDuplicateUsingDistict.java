package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingDistict {
    public static void main(String[] args) {
        ArrayList<String>al = new ArrayList<>(Arrays.asList("ram","ram","sham","anhi"));
        List<String> result = al.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
