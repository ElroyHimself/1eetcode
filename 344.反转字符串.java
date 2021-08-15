/*
 * @Author: your name
 * @Date: 2021-08-15 15:00:17
 * @LastEditTime: 2021-08-15 15:02:11
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\344.反转字符串.java
 */
/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length -1;
        while(i < j) {
            char tem = s[i];// tem暂存s[i]
            s[i] = s[j];
            s[j] = tem;
            i++;
            j--;
        }
    }
}
// @lc code=end

