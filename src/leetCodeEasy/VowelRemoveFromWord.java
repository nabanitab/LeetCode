package leetCodeEasy;

import java.util.stream.Collectors;

public class VowelRemoveFromWord {
    public static void main(String[] args) {
        String s = "nabanita";
        System.out.println(removeVowels(s));
    }

    static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String removeVowelsSolTwo(String s) {
        return s.chars()
                .filter(c -> "aeiou".indexOf(c) == -1) // filter out vowels
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}

