/*
 * @Author: your name
 * @Date: 2021-08-15 21:48:37
 * @LastEditTime: 2021-08-15 21:56:46
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\283.移动零.java
 */
/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for( int j = 0; j < nums.length; j++ ) {
            if(nums[j] != 0){ // 若指针对应的值为0，i不动 j+1.  若不为0，则将j对应的值与i互换， i+1.
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            
        }
    }
}
// @lc code=end

