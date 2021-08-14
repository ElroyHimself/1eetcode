/*
 * @Author: your name
 * @Date: 2021-08-14 17:00:32
 * @LastEditTime: 2021-08-14 17:07:09
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\189.旋转数组.java
 */
/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArra = new int[n];
        for(int i = 0; i < n; i++) {
            newArra[(i+k) % n] = nums[i];
        }
        System.arraycopy(newArra, 0, nums, 0, n); /*将newArra数组的值  拷贝到numsSystem.arrayCopy(srcBytes,0,destBytes ,0,5)
                                                    System.arraycopy: 创建一个一维空数组,数组的总长度为 12位,然后将srcBytes源数组中 从0位 
                                                    到 第5位之间的数值 copy 到 destBytes目标数组中,在目标数组的第0位开始放置.
                                                                                    */
    }
}
// @lc code=end

