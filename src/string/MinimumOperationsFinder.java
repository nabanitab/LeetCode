package string;

public class MinimumOperationsFinder {

    public int findMinimumOperations(String s1, String s2, String s3) {
        int len = Math.min(s1.length(), Math.min(s2.length(), s3.length())); // Calculate the length of the shortest string among s1, s2, and s3
        int sum = s1.length() + s2.length() + s3.length(); // Sum of lengths of all three strings

        // Check if the first characters of s1, s2, and s3 are not the same
        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s2.charAt(0) != s3.charAt(0)) {
            return -1; // If not the same, return -1 as it's impossible to match the first character
        }

        // Iterate through the strings until a mismatch is found
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                sum -= 3; // Decrement the sum by 3 for each matching character in the strings
            } else {
                break; // Break the loop when a mismatch is encountered
            }
        }

        return sum; // Return the sum of lengths of three strings minus the matched characters
    }

    public static void main(String[] args) {
        MinimumOperationsFinder operationsFinder = new MinimumOperationsFinder();

        // Example usage
        String s1 = "abc";
        String s2 = "abb";
        String s3 = "ab";
        int result = operationsFinder.findMinimumOperations(s1, s2, s3);
        System.out.println("Minimum operations: " + result);
    }
}

