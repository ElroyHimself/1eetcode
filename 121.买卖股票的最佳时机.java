/*
 * @Date: 2021-06-17 10:12:57
 * @LastEditors: ELROY
 * @LastEditTime: 2021-06-17 10:37:17
 * @FilePath: \undefinedc:\Users\陆振亚\.leetcode\121.买卖股票的最佳时机.java
 */
/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
            int n = prices.length;
            int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++){
                dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
                dp_i_1 = Math.max(dp_i_1,-prices[i]);
            }
            return dp_i_0;
    }
}
// @lc code=end

