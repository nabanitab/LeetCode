package string;

public class GreatestCommonDivisorSolution {

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Find the GCD of lengths
        int gcdLength = gcd(len1, len2);

        // Extract the potential common divisor
        String potentialDivisor = str1.substring(0, gcdLength);

        // Check if the potential divisor divides both strings
        if (isDivisor(str1, potentialDivisor) && isDivisor(str2, potentialDivisor)) {
            return potentialDivisor;
        }

        return "";
    }

    // Helper method to find the GCD of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to check if the given string is a divisor of another string
    private boolean isDivisor(String str, String divisor) {
        int strLen = str.length();
        int divLen = divisor.length();
        if (strLen % divLen != 0) {
            return false;
        }

        int repetitions = strLen / divLen;
        StringBuilder reconstructed = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            reconstructed.append(divisor);
        }

        return reconstructed.toString().equals(str);
    }

    public static void main(String[] args) {
        GreatestCommonDivisorSolution solution = new GreatestCommonDivisorSolution();

        // Example 1
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(solution.gcdOfStrings(str1, str2)); // Output: "ABC"

        // Example 2
        String str3 = "ABABAB";
        String str4 = "ABAB";
        System.out.println(solution.gcdOfStrings(str3, str4)); // Output: "AB"

        // Example 3
        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println(solution.gcdOfStrings(str5, str6)); // Output: ""
    }
}

