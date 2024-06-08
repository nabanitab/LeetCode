package dP;

//you're given a list of items, each with a weight and a value, and a knapsack with a maximum capacity. The goal
// is to determine the maximum total value you can fit in the knapsack without exceeding its capacity.
public class KnapsackDP {

    // Function to solve the 0/1 Knapsack Problem using Dynamic Programming
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The maximum value that can be achieved with the given capacity
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        System.out.println("Maximum value in knapsack = " + knapsack(weights, values, capacity));
    }
}
