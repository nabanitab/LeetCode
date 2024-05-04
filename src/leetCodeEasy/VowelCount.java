package leetCodeEasy;

import java.util.List;

public class VowelCount {

    public static void main(String[] args) {
        String sentence = "This is Java Interview";
        countVowels(sentence);
        String s="This is Java Interview";
        test(s);
    }

    static void countVowels(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Iterate through each word
        for (String word : words) {
            // Convert the word to lowercase for case-insensitive counting
            String lowerCaseWord = word.toLowerCase();

            // Count the occurrences of vowels in the word
            int vowelCount = 0;
            for (char c : lowerCaseWord.toCharArray()) {
                if (isVowel(c)) {
                    vowelCount++;
                }
            }

            // Print the result for each word
            System.out.println(word + ": " + vowelCount);
        }
    }

    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    static void test(String s){
        String [] words=s.split("\\s");

        for (String word: words){
            System.out.println(countVowel(word.toLowerCase()));
        }
    }

    private static int countVowel(String word){

        List<Character> list=List.of('a','e','i','o','u');
        int count=0;
        for (int i=0;i<word.length();i++){
            if (list.contains(word.charAt(i)))
                count++;
        }
        return count;
    }
}
