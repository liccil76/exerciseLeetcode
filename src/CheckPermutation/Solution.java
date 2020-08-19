package CheckPermutation;

public class Solution {
    /**
     * 面试题 01.02. 判定是否互为字符重排
     * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     *
     * 示例 1：
     * 输入: s1 = "abc", s2 = "bca"
     * 输出: true
     *
     * 示例 2：
     * 输入: s1 = "abc", s2 = "bad"
     * 输出: false
     *
     * 说明：
     * 0 <= len(s1) <= 100
     * 0 <= len(s2) <= 100
     */
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int[] nums = new int[26];
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            nums[s1.charAt(i)-97]++;
            nums[s2.charAt(i)-97]--;
        }
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}