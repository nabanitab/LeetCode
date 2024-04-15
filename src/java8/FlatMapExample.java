package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        List<Character> characters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());

        System.out.println("Characters: " + characters);
    }
}
