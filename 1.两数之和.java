/*
 * @Date: 2021-06-16 18:48:05
 * @LastEditors: ELROY
 * @LastEditTime: 2021-06-16 18:54:21
 * @FilePath: \.leetcode\1.两数之和.java
 */
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++){
                    if (nums[i] + nums[j] == target) return new int[]{i,j};
                }
            }
            return null;
    }
    
}
// @lc code=end

