package arrayProgram;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();

        // Example 1
        String[] ops1 = {"5","2","C","D","+"};
        System.out.println(baseballGame.calPoints(ops1)); // Output: 30

        // Example 2
        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(baseballGame.calPoints(ops2)); // Output: 27

        // Example 3
        String[] ops3 = {"1","C"};
        System.out.println(baseballGame.calPoints(ops3)); // Output: 0
    }
}

