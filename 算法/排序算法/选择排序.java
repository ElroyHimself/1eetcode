/*
 * @Author: your name
 * @Date: 2021-08-16 16:16:37
 * @LastEditTime: 2021-08-16 16:40:45
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\算法\排序算法\选择排序.java
 */
package 算法.排序算法;

public class 选择排序 {
    public  static void selectionsort(int[] nums) {
        if (nums == null || nums.length <2 )  return; //为空，只有一个元素 不用排序

        for( int i = 0; i < nums.length; i++ ) {   //每次循环i都能找到剩下元素中最小的与当前i对应的元素交换，实现前i个元素有序。
            int minIndex = i;
            for (int j = minIndex+1; j < nums.length; j++) {
                minIndex = nums[j] < nums[minIndex] ? j: minIndex;
        }
        swap(nums, i ,minIndex);
        }
        
    }
    
    public  static void swap(int[] nums,int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}