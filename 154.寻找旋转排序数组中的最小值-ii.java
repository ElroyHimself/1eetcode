/*
 * @Author: your name
 * @Date: 2021-08-14 02:14:38
 * @LastEditTime: 2021-08-14 02:28:55
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\154.寻找旋转排序数组中的最小值-ii.java
 */
/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
 */

// @lc code=start
import java.util.ArrayList;
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length ==0) return 0;
    int ans = nums[0];
    for(int i = nums.length-1; i>0 ;--i){
        if(ans > nums[i]) ans = nums[i];
        
    }
    return ans;
    }
    
}
// @lc code=end

