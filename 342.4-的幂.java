/*
 * @Author: your name
 * @Date: 2021-12-08 12:31:54
 * @LastEditTime: 2021-12-08 12:38:07
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \stanford-corenlp-4.2.2c:\Users\陆振亚\.leetcode\342.4-的幂.java
 */
/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1 ) return false;
        while(n % 4 == 0){
            n /= 4;
        }
        return n  == 1 ;
    }
}
// @lc code=end

