package arrayProgram;

//time complexity : O(n)
public class StockBuyAndSaleGFG {

    public static void main(String[] args) {

        int price[] = {1, 5, 3, 8, 12};

        int n = 5;

        System.out.println(maxProfit(price, n));

    }

    public static int maxProfit(int[] price, int n) {
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1])
                profit += price[i] - price[i - 1];
        }
        return profit;
    }
}
