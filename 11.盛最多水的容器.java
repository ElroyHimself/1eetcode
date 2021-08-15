/*
 * @Author: your name
 * @Date: 2021-08-15 21:42:26
 * @LastEditTime: 2021-08-15 21:47:17
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\11.盛最多水的容器.java
 */
/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int max = 0;
        while(i < j){
            if (height[i] < height[j]){
                max = Math.max(max, (j-i) * height[i++]);
            }
            else{
                max = Math.max(max, (j-i) * height[j--]);
            }
        }
        return max;
    }
}
// @lc code=end

