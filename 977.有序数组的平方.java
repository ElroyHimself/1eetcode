/*
 * @Author: your name
 * @Date: 2021-08-14 16:58:39
 * @LastEditTime: 2021-08-14 17:00:03
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\977.有序数组的平方.java
 */
/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i] ;

        }
        Arrays.sort(nums);
        return nums;
    }
}
// @lc code=end

