package isUnique;

public class Solution {
    /**
     * 面试题 01.01. 判定字符是否唯一
     * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
     *
     * 示例 1：
     * 输入: s = "leetcode"
     * 输出: false
     *
     * 示例 2：
     * 输入: s = "abc"
     * 输出: true
     *
     * 限制：
     * 0 <= len(s) <= 100
     * 如果你不使用额外的数据结构，会很加分。
     */
    //方法一
    public boolean isUnique(String astr) {
        int[] temp = new int[26];
        for (byte aByte : astr.getBytes()) {
            if(temp[aByte-97]>=1) return false;
            temp[aByte-97]++;
        }
        return true;
    }
    //方法二，不使用额外数据结构，位运算
    public boolean isUnique2(String astr) {
        long low64 = 0;
        long high64 = 0;
        for (char c : astr.toCharArray()) {
            if (c >= 64) {
                long bitIndex = 1L << c - 64;
                if ((high64 & bitIndex) != 0) {
                    return false;
                }
                high64 |= bitIndex;
            } else {
                //c<64
                long bitIndex = 1L << c;
                if ((low64 & bitIndex) != 0) {
                    return false;
                }
                low64 |= bitIndex;
            }
        }
        return true;
    }
}