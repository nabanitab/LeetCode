package arrayProgram;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isInSameRow(word.toLowerCase(), rows)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean isInSameRow(String word, String[] rows) {
        for (String row : rows) {
            if (isWordInRow(word, row)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWordInRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        KeyboardRow solution = new KeyboardRow();

        // Example 1
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result1 = solution.findWords(words1);
        for (String word : result1) {
            System.out.print(word + " ");  // Output: Alaska Dad
        }
        System.out.println();

        // Example 2
        String[] words2 = {"omk"};
        String[] result2 = solution.findWords(words2);
        for (String word : result2) {
            System.out.print(word + " ");  // Output:
        }
        System.out.println();

        // Example 3
        String[] words3 = {"adsdf", "sfd"};
        String[] result3 = solution.findWords(words3);
        for (String word : result3) {
            System.out.print(word + " ");  // Output: adsdf sfd
        }
    }
}

