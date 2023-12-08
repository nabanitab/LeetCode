package string;

import java.util.ArrayList;
import java.util.List;

public class WordFinder {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < words.length; ++i){
            for(int j = 0; j < words[i].length(); ++j){
                if(words[i].charAt(j) == x) { ans.add(i); break; }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        WordFinder wordFinder = new WordFinder();

        // Example 1
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        List<Integer> output1 = wordFinder.findWordsContaining(words1, x1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        List<Integer> output2 = wordFinder.findWordsContaining(words2, x2);
        System.out.println("Output 2: " + output2);

        // Example 3
        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        List<Integer> output3 = wordFinder.findWordsContaining(words3, x3);
        System.out.println("Output 3: " + output3);
    }
}

