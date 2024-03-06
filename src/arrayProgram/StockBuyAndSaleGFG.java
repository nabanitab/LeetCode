package arrayProgram;

//time complexity : O(n)
public class StockBuyAndSaleGFG {

    public static void main(String[] args) {

        int price[] = {1, 5, 3, 8, 12};

        int n = 5;

        System.out.println(maxProfit(price, n));

    }

    //A for loop is used to iterate over the elements of the price array, starting from index 1 and ending at index n - 1.
    //Within the loop, it checks if the current stock price (price[i]) is greater than the previous stock price
    // (price[i - 1]). If it is, it means there is a potential profit to be made by buying at the previous price and
    // selling at the current price.
    //If the condition is true, it calculates the profit by subtracting the previous price from
    // the current price and adds it to the profit variable.
    public static int maxProfit(int[] price, int n) {
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1])
                profit += price[i] - price[i - 1];
        }
        return profit;
    }
}
