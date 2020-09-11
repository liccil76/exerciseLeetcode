package countSegments;

public class Solution {
    /**
     * 434. 字符串中的单词数
     * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
     * 请注意，你可以假定字符串里不包括任何不可打印的字符。
     *
     * 示例:
     * 输入: "Hello, my name is John"
     * 输出: 5
     * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
     */
    public int countSegments(String s) {
        int count = 0,len = 0;
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            if(aByte!=32){
                len++;
            }else{
                if(len>0){
                    count++;
                    len=0;
                }
            }
        }
        if(len>0) count++;
        return count;
    }
}