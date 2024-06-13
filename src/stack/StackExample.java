package stack;

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Attempt to push to a full stack
        stack.push(60);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Elements popped from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Attempt to pop from an empty stack
        stack.pop();
    }
}

