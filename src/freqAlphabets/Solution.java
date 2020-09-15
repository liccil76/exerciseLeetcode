package freqAlphabets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 1309. 解码字母到整数映射
     * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。
     * 我们希望按下述规则将 s 映射为一些小写英文字符：
     * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
     * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
     * 返回映射之后形成的新字符串。
     *
     * 题目数据保证映射始终唯一。 
     *
     * 示例 1：
     * 输入：s = "10#11#12"
     * 输出："jkab"
     * 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
     *
     * 示例 2：
     * 输入：s = "1326#"
     * 输出："acz"
     *
     * 示例 3：
     * 输入：s = "25#"
     * 输出："y"
     *
     * 示例 4：
     * 输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
     * 输出："abcdefghijklmnopqrstuvwxyz"
     *
     * 提示：
     * 1 <= s.length <= 1000
     * s[i] 只包含数字（'0'-'9'）和 '#' 字符。
     * s 是映射始终存在的有效字符串。
     */
    //方法一
    public String freqAlphabets(String s) {
        int index = s.length()-1;
        List<Character> list = new ArrayList<>();
        while (index>=0){
            char c = s.charAt(index);
            if(c=='#'){
                String substring = s.substring(index - 2, index);
                int temp = Integer.parseInt(substring) + 96;
                list.add((char)temp);
                index -= 3;
            }else{
                char temp = (char)(Integer.parseInt(String.valueOf(c)) +96);
                list.add(temp);
                index--;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    //方法二，一次遍历
    public String freqAlphabets2(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index<=s.length()-1){
            char c;
            if(index+2<=s.length()-1) c = s.charAt(index+2);
            else c = s.charAt(index);
            if(c=='#'){
                String substring = s.substring(index, index + 2);
                int temp = Integer.parseInt(substring) + 96;
                sb.append((char)temp);
                index += 3;
            }else{
                c = s.charAt(index);
                char temp = (char)(Integer.parseInt(String.valueOf(c)) +96);
                sb.append(temp);
                index++;
            }
        }
        return sb.toString();
    }
}