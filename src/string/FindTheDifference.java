package string;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int charSumS = 0;
        int charSumT = 0;

        // Calculate the sum of ASCII values of characters in s
        for (char ch : s.toCharArray()) {
            charSumS += (int) ch;
        }

        // Calculate the sum of ASCII values of characters in t
        for (char ch : t.toCharArray()) {
            charSumT += (int) ch;
        }

        // Return the added letter by subtracting the sum of characters in s from the sum of characters in t
        return (char) (charSumT - charSumS);
    }

    public static void main(String[] args) {
        FindTheDifference solution = new FindTheDifference();

        // Example 1
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println(solution.findTheDifference(s1, t1)); // Output: "e"

        // Example 2
        String s2 = "";
        String t2 = "y";
        System.out.println(solution.findTheDifference(s2, t2)); // Output: "y"
    }
}

