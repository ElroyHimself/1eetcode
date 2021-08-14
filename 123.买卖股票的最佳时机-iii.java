/*
 * @Date: 2021-06-17 11:00:33
 * @LastEditors: ELROY
 * @LastEditTime: 2021-06-17 11:36:20
 * @FilePath: \undefinedc:\Users\陆振亚\.leetcode\123.买卖股票的最佳时机-iii.java
 */
/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int maxK = 2;
        int[][][] dp= new int[n][maxK+1][2];
        for (int k = 1; k <= maxK; k++){
            dp[0][k][1] = - prices[0];
        }
        for (int i = 1; i < n; i++){
            for (int k = 1; k <= maxK; k++){
                dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k-1][0] - prices[i]);
            }

        }
        return dp[n-1][2][0];
        
}
}
// @lc code=end

