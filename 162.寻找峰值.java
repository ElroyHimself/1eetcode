/*
 * @Author: your name
 * @Date: 2021-08-14 23:13:19
 * @LastEditTime: 2021-08-14 23:40:41
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\162.寻找峰值.java
 */
/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length-1;
        while (left<right){   //二分查找
            int mid = left + (right - left) / 2;
            //在两端 或者mid
            if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == nums.length-1|| nums[mid] > nums[mid+1]) ){
                return mid;
            }
            else if(nums[mid] < nums[mid+1]){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return left;
    }
}
// @lc code=end

