package string;

import java.util.HashSet;
import java.util.Set;

public class StringPairFinder {

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Set<String> unmatched = new HashSet<>();

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (unmatched.contains(reversed)) {
                count++;
                unmatched.remove(reversed);
            } else {
                unmatched.add(word);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        StringPairFinder stringPairFinder = new StringPairFinder();

        // Example 1
        String[] words1 = {"cd", "ac", "dc", "ca", "zz"};
        int output1 = stringPairFinder.maximumNumberOfStringPairs(words1);
        System.out.println("Output 1: " + output1);

        // Example 2
        String[] words2 = {"ab", "ba", "cc"};
        int output2 = stringPairFinder.maximumNumberOfStringPairs(words2);
        System.out.println("Output 2: " + output2);

        // Example 3
        String[] words3 = {"aa", "ab"};
        int output3 = stringPairFinder.maximumNumberOfStringPairs(words3);
        System.out.println("Output 3: " + output3);
    }
}

