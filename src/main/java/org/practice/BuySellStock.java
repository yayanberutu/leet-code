/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: BuySellStock.java , v 0.1 2024-07-31 23.58 Yosepri Disyandro Berutu Exp $$
 */
public class BuySellStock {

    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;

        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
                sellPrice = 0;
            } else {
                if (price > sellPrice) {
                    sellPrice = price;
                }
            }

            // calculate max price
            maxProfit = Math.max(maxProfit, sellPrice - buyPrice);
        }

        return maxProfit;
    }
}
