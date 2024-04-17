package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Q. Reverse only the vowels in a String
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelInString {

    public static void main(String[] args) {

        String str = "Susmita";

        System.out.println(getReverseVowel(str));
    }

    private static String getReverseVowel(String str) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        StringBuilder sb = new StringBuilder();
        // Iterate over the characters of the string
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (vowels.contains(ch)) {
                // Append the vowel to the StringBuilder
                sb.append(ch);
            }
        }

        // Return the reversed vowels
        return sb.toString();
    }
}
