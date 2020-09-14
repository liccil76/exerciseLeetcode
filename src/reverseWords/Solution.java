package reverseWords;

public class Solution {
    /**
     * 557. 反转字符串中的单词 III
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
     *
     * 示例：
     * 输入："Let's take LeetCode contest"
     * 输出："s'teL ekat edoCteeL tsetnoc" 
     *
     * 提示：
     * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
     */
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] strArr = s.split(" ");//这里耗时了
        for (String s1 : strArr) {
            char[] chars = s1.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
    public String reverseWords2(String s) {
        StringBuffer ret = new StringBuffer();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}