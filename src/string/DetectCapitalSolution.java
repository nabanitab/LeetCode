package string;

public class DetectCapitalSolution {

    public boolean detectCapitalUse(String word) {
        int n = word.length();

        // Case 1: All letters are capitals
        if (word.toUpperCase().equals(word)) {
            return true;
        }

        // Case 2: All letters are not capitals
        if (word.toLowerCase().equals(word)) {
            return true;
        }

        // Case 3: Only the first letter is capital
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).toLowerCase().equals(word.substring(1))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        DetectCapitalSolution solution = new DetectCapitalSolution();

        // Example 1
        String word1 = "USA";
        System.out.println(solution.detectCapitalUse(word1)); // Output: true

        // Example 2
        String word2 = "FlaG";
        System.out.println(solution.detectCapitalUse(word2)); // Output: false
    }
}

