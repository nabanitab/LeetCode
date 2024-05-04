package leetCodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringsBySeparator {

    public static void main(String[] args) {

        String[] words = {"one.two.three", "four.five", "six", "manindra.kumar"};
        char separator = '.';
        String[] result = splitStrings(words, separator);

        //print the result
        for (String part : result) {
            System.out.println(part);
        }
    }

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        return words.stream()
                .flatMap(word -> Arrays.stream(word.split(String.valueOf(separator))))
                .collect(Collectors.toList());
    }

    static String[] splitStrings(String[] words, char separator) {

        List<String> result = new ArrayList<>();

        for (String word : words) {
            int start = 0;
            int end = word.indexOf(separator);
            while (end != -1) {

                //add a sub string from start to end to the result
                result.add(word.substring(start, end));

                //update start to be the character after the separator
                start = end + 1;

                //find the next occurrence of the separator
                end = word.indexOf(separator, start);
            }
            //add the remaining part of the string (or the whole string if no separator is found)
            result.add(word.substring(start));
        }
        return result.toArray(new String[0]);
    }
}
