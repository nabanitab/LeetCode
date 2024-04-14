package arraylist;

import java.util.ArrayList;

public class CommonWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("rangila");
        words.add("changilla");
        words.add("rangi");
        words.add("ranjit");
        words.add("chakipanday");

        ArrayList<String> commonWords = findCommonWords(words);
        System.out.println("Common words with the same first three letters:");
        for (String word : commonWords) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> findCommonWords(ArrayList<String> words) {
        ArrayList<String> commonWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            String firstThreeLetters = currentWord.substring(0, 3); // Extract first three letters
            boolean foundCommon = true;
            for (int j = 0; j < words.size(); j++) {
                if (i != j) { // Skip comparing the word with itself
                    String otherWord = words.get(j);
                    if (!otherWord.startsWith(firstThreeLetters)) {
                        foundCommon = false;
                        break;
                    }
                }
            }
            if (foundCommon) {
                commonWords.add(currentWord);
            }
        }
        return commonWords;
    }
}

