/*
 * @Author: your name
 * @Date: 2021-08-15 22:00:07
 * @LastEditTime: 2021-08-15 22:03:37
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\80.删除有序数组中的重复项-ii.java
 */
/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2 ) return nums.length;
        int  index = 2;
        for ( int i = 2; i < nums.length; i++ ){
            if(nums[i] != nums[index - 2]){
                nums[index++] = nums[i];
            }
            
        }
        return index;
    }
}
// @lc code=end

