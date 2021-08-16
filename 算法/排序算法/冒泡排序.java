/*
 * @Author: your name
 * @Date: 2021-08-16 16:26:40
 * @LastEditTime: 2021-08-16 16:49:20
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\算法\排序算法\冒泡排序.java
 */
package 算法.排序算法;

public class 冒泡排序 {
    public  static void selectionsort(int[] nums) {
        if (nums == null || nums.length < 2 )  return; //

        
        for( int e = nums.length - 1; e > 0; e-- ) {
            for(int i = 0; i < e; i++ ) {
                if( nums[i] > nums[i+1]){
                    swap(nums, i, i+1);
                }
            }    
        }
    
    }
    public  static void swap(int[] nums, int i,int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    }
/*
 * @Author: your name
 * @Date: 2021-08-16 16:26:40
 * @LastEditTime: 2021-08-16 16:26:41
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\算法\排序算法\冒泡排序.java
 */
