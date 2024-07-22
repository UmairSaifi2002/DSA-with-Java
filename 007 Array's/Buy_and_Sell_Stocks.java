import java.util.*;

public class Buy_and_Sell_Stocks {

    public static int max_profit(int arr[]){
        // so we can tackle this problem by making an array which tells the profit of that day
        // if you sell the stock on that day
        // int profit[] = new int[arr.length];
        // profit[0] = 0; // because at the first day you only buy the stock donot sell
        // int min = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     for (int j = 0; j < i; j++) min = min > arr[j] ? arr[j] : min ;
        //     profit[i] = (arr[i] - min) > 0 ? (arr[i] - min) : 0;
        // }
        // int max = 0;
        // for (int i = 0; i < profit.length; i++){ 
        //     max = max < profit[i] ? profit[i] : max ;
        //     // System.out.print(profit[i]);
        // }
        // return max;

        // ************************* By Teacher ********************
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) { // Profit
                int profit = arr[i] - buyPrice; // Today's Profit.
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // You are given an array prices where prices[i] is the price of a given stock
        // on the ith day. You want to maximize your profit by choosing a single day to
        // buy one stock and choosing a different day in the future to sell that stock.
        // return the maximum profit you can achieve from this transection. if you
        // cannot achieve any profit, return 0.
        int price[] = {7,1,5,3,6,4}; 
        int result = max_profit(price);
        System.out.println("The max price is "+result);
    }
}