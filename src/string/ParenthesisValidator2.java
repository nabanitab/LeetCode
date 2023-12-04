package string;

public class ParenthesisValidator2 {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
            } else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            if (high < 0) {
                return false;
            }
        }
        return low == 0;
    }

    public static void main(String[] args) {
        ParenthesisValidator2 validator = new ParenthesisValidator2();

        // Example 1
        String s1 = "()";
        System.out.println("Output 1: " + validator.checkValidString(s1));

        // Example 2
        String s2 = "(*)";
        System.out.println("Output 2: " + validator.checkValidString(s2));

        // Example 3
        String s3 = "(*))";
        System.out.println("Output 3: " + validator.checkValidString(s3));
    }
}

