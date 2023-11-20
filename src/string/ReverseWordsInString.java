package string;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        // Split the string into words using regular expression
        String[] words = s.trim().split("\\s+");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString solution = new ReverseWordsInString();

        // Example 1
        String s1 = "the sky is blue";
        System.out.println(solution.reverseWords(s1)); // Output: "blue is sky the"

        // Example 2
        String s2 = "  hello world  ";
        System.out.println(solution.reverseWords(s2)); // Output: "world hello"

        // Example 3
        String s3 = "a good   example";
        System.out.println(solution.reverseWords(s3)); // Output: "example good a"
    }
}


