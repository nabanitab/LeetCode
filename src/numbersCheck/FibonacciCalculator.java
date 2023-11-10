package numbersCheck;

//You are tasked with implementing a Java class FibonacciCalculator to calculate the Fibonacci number for a given input n. The Fibonacci sequence is defined as follows:
//
//F(0) = 0
//F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1
public class FibonacciCalculator {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int[] fibArray = new int[n + 1];
            fibArray[0] = 0;
            fibArray[1] = 1;

            for (int i = 2; i <= n; i++) {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }

            return fibArray[n];
        }
    }

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();

        // Example Test Cases
        int test1 = 2;
        System.out.println("F(" + test1 + ") = " + calculator.fib(test1));  // Output: F(2) = 1

        int test2 = 3;
        System.out.println("F(" + test2 + ") = " + calculator.fib(test2));  // Output: F(3) = 2

        int test3 = 4;
        System.out.println("F(" + test3 + ") = " + calculator.fib(test3));  // Output: F(4) = 3
    }
}
