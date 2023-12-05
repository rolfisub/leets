package leets;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        SolutionTest.main(args);
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }


        return maxProfit;

        /**
         * FIRST ATTEMPT BRUTE FORCE
         */
        // int currentMaxProfit = 0;

        // for(int i = 0; i < prices.length; i++) {
        //     // iterate over prices again to the right of the current position
        //     for(int y = i + 1; y < prices.length; y++) {
        //         // calculate day profit and max profit
        //         int yProfit = prices[y] - prices[i];
        //         if (yProfit > 0) {
        //             currentMaxProfit = currentMaxProfit < yProfit ? yProfit : currentMaxProfit;
        //         }
        //     }
        // }

        // return currentMaxProfit;
    }
}