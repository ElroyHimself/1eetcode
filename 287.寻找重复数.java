/*
 * @Author: your name
 * @Date: 2021-08-15 22:16:23
 * @LastEditTime: 2021-08-15 22:41:43
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \undefinedc:\Users\陆振亚\.leetcode\287.寻找重复数.java
 */
/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left= 0 , right = 1;
        while( right < nums.length){
            if(nums[right] != nums[left]){
                left++;
                right++;
            }
            else return nums[left];
        }
        return -1;
    }
}
// @lc code=end

