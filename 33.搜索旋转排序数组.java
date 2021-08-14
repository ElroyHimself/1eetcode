/*
 * @Author: your name
 * @Date: 2021-08-14 01:56:22
 * @LastEditTime: 2021-08-14 13:07:15
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\33.搜索旋转排序数组.java
 */
/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
/*解法一 暴力求解
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return 0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i] ==target) return i;
    }
    return -1;
}
}
*/
//解法二  二分法

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid; 
            else if(nums[mid] < nums[right]){           // 中间小于最右边 说明区间没有反转    
                if(nums[mid] <target && target <= nums[right]) left = mid + 1;// 如果中间值小于右边大于左边  则说明target在有序区间内
                else  right = mid -1;
            }
            else {                                     //中间大于右边，说明区间有反转  则不能以右侧为主。找左边
                if(nums[left] <=target && target <nums[mid]) right = mid-1;
                else left = mid + 1;
            } 
        }
        return -1;
    }
}
// @lc code=end

