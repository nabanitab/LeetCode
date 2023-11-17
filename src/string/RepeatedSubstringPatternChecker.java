package string;

class RepeatedSubstringPatternChecker {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                for (int j = 0; j < n / i; j++) {
                    repeated.append(substring);
                }

                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPatternChecker checker = new RepeatedSubstringPatternChecker();

        // Test cases
        System.out.println(checker.repeatedSubstringPattern("abab"));  // Output: true
        System.out.println(checker.repeatedSubstringPattern("aba"));   // Output: false
        System.out.println(checker.repeatedSubstringPattern("abcabcabcabc"));  // Output: true
    }
}


