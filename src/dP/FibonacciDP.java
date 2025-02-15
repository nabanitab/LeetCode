package dP;

public class FibonacciDP {

    // Function to compute the n-th Fibonacci number using Dynamic Programming
    public static int fibonacci(int n) {
        // Edge cases
        if (n <= 1) {
            return n;
        }

        // Array to store the Fibonacci numbers
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 1;

        // Fill the dp array
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return the n-th Fibonacci number
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;  // Change this value to compute a different Fibonacci number
        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci(n));
    }
}


