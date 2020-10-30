package firstUniqChar;

public class Solution {
    /**
     * 剑指 Offer 50. 第一个只出现一次的字符
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     *
     * 示例:
     * s = "abaccdeff"
     * 返回 "b"
     * s = ""
     * 返回 " "
     *  
     * 限制：
     * 0 <= s 的长度 <= 50000
     */
    public char firstUniqChar(String s) {
        int[] arr = new int[26];
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            arr[aByte-97]++;
        }
        for (byte aByte : bytes) {
            if(arr[aByte-97]==1) return (char)aByte;
        }
        return ' ';
    }
}