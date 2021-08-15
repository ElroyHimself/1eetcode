/*
 * @Author: your name
 * @Date: 2021-08-15 21:28:24
 * @LastEditTime: 2021-08-15 21:36:42
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\26.删除有序数组中的重复项.java
 */
/*
 * @lc app=leetcode.cn id=26 lang=java
 * 
 *     两个指针i,j从0开始当不重复时 i,j向前。若重复i不动，j++
 * 
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while(right < nums.length){
            if(left == 0 || nums[right] != nums[left - 1]) { // left左边都是处理好的
                nums[left++] = nums[right++];
            }
            else right++;
           
        }
        return left;
        
    }
}
// @lc code=end

