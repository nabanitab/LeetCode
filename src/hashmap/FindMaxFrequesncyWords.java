package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMaxFrequesncyWords {
    public static List<String> findWordsWithFreq(String[] words, int k) {

        // Step 1: Count frequency
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Step 2: Collect all words having frequency == k
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == k) {
                result.add(entry.getKey());
            }
        }

        return result; // may return multiple words
    }

    public static void main(String[] args) {
        String[] words = {"I", "love", "leetcode", "I", "love", "Java"};
        int k = 2;

        System.out.println(findWordsWithFreq(words, k)); // Output: [I, love]
    }
}

