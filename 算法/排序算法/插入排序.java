/*
 * @Author: your name
 * @Date: 2021-08-16 16:53:41
 * @LastEditTime: 2021-08-16 17:02:00
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\算法\排序算法\插入排序.java
 */
package 算法.排序算法;

public class 插入排序 {
    public  static void Insertionsort(int[] nums) {
        if (nums == null || nums.length < 2 )  return; //

        for(int i = 1; i < nums.length; i++) {
            for(int j = i - 1 ; j >= 0 && nums[j] > nums[j + 1]; j--) {
                    swap(nums, j, j + 1);
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
 * @Date: 2021-08-16 16:53:41
 * @LastEditTime: 2021-08-16 16:53:41
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\算法\排序算法\插入排序.java
 */
