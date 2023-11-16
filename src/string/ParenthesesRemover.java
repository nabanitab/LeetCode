package string;

class ParenthesesRemover {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' && openCount++ > 0) {
                result.append(c);
            }
            if (c == ')' && openCount-- > 1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ParenthesesRemover remover = new ParenthesesRemover();

        // Test cases
        System.out.println(remover.removeOuterParentheses("(()())(())")); // Output: "()()()"
        System.out.println(remover.removeOuterParentheses("(()())(())(()(()))")); // Output: "()()()()(())"
        System.out.println(remover.removeOuterParentheses("()()")); // Output: ""
    }
}

