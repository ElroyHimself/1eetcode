/*
 * @Author: your name
 * @Date: 2021-08-13 22:00:23
 * @LastEditTime: 2021-08-13 22:22:26
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\167.两数之和-ii-输入有序数组.java
 */
/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start

/*错误代码   只想到了简单的二分查找，
/** class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(numbers[left] + numbers[mid] == target) return new int [] {left+1,mid+1};
            if(numbers[left] + numbers[mid] < target) {
                
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            left+=left
        }
        return null;
    }
}*/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        for(int i=0; i<numbers.length; ++i){                 //首先确定一个数字，接着利用二分查找从后面的数字中找
            int left = i+1, right = numbers.length -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if(numbers[mid] == target-numbers[i]) return new int [] {i+1,mid+1};
                if(numbers[mid] >  target-numbers[i]) {
                    right = mid - 1;right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
        }
        }
        return null;
    }
}
// @lc code=end

