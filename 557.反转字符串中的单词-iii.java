/*
 * @Author: your name
 * @Date: 2021-08-16 21:10:53
 * @LastEditTime: 2021-12-08 12:42:05
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \.leetcode\557.反转字符串中的单词-iii.java
 */
/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        char[] strArray = s.toCharArray();
        int left = 0, right =0;
        while(right < strArray.length){
            if(right == strArray.length || strArray[right] ==' '){
                if(right ==0){
                    continue;
                }
                swap(strArray,left,right-1);
                left = right + 1;
            }
            right++;
        }
        return new String(strArray);
    }

    public static void swap(char[] arr, int i , int j) {
        while(i < j){
            char tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;
        }

    }
}
// @lc code=end

