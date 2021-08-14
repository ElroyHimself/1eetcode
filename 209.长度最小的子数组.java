/*
 * @Author: your name
 * @Date: 2021-08-14 17:08:16
 * @LastEditTime: 2021-08-14 17:24:04
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\209.长度最小的子数组.java
 */
/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int cnt = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt += nums[i];
            while(cnt >= target) {
                len  = len == 0 ? i-j+1 : Math.min(len, i-j+1);
                cnt -= nums[j++];
            }
            
            
        }
        return len;
    }
}
// @lc code=end

