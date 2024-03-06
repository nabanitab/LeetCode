package arrayProgram;

public class StockBuyAndSaleAndMaxProfitGFG {

    public static void main(String[] args) {
        int price[] = {1, 5, 3, 8, 12};
        int n = 5;
        int[] result = maxProfit(price, n);
        System.out.println("Maximum Profit: " + result[0]);
        System.out.println("Buy on day: " + result[1]);
        System.out.println("Sell on day: " + result[2]);
    }

    public static int[] maxProfit(int[] price, int n) {
        int profit = 0;
        int buyDay = 0;
        int sellDay = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
                sellDay = i;
            } else {
                if (price[i] < price[buyDay]) {
                    buyDay = i;
                }
            }
        }
        return new int[]{profit, buyDay, sellDay};
    }
}

