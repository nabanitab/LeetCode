import java.util.HashMap;

public class NumberOfOccurence {

    public static String runLengthEncoding(String input) {
        if (input == null || input.isEmpty()) {
            return ""; // Return empty string for null or empty input
        }

        StringBuilder encoded = new StringBuilder();
        char[] chars = input.toCharArray();


        int count = 1; // Count for the current character
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++; // Increment count for consecutive characters
            } else {
                // Append the character and its count to the encoded string
                encoded.append(chars[i - 1]).append(count);
                count = 1; // Reset the count for the new character
            }
        }

        // Append the last character and its count
        encoded.append(chars[chars.length - 1]).append(count);

        return encoded.toString();
    }

    public static void main(String[] args) {
        System.out.println(runLengthEncoding("a"));         // Output: "a1"
        System.out.println(runLengthEncoding("aa"));        // Output: "a2"
        System.out.println(runLengthEncoding("aabbb"));     // Output: "a2b3"
        System.out.println(runLengthEncoding("aabbbaa"));   // Output: "a2b3a2"
        System.out.println(runLengthEncoding(""));          // Output: ""
    }
}

