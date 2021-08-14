/*
 * @Date: 2021-06-16 18:56:55
 * @LastEditors: ELROY
 * @LastEditTime: 2021-06-16 19:05:00
 * @FilePath: \.leetcode\7.整数反转.java
 */
/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
            int reverse = 0;
            while(x != 0){
                if (reverse < Integer.MIN_VALUE / 10 || reverse > Integer.MAX_VALUE  / 10) {
                return 0;
            }
                int a =  x % 10;
                x /= 10;
                reverse = reverse*10 + a;
            }
        return reverse;
    }
}
// @lc code=end

