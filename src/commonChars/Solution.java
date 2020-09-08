package commonChars;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * 1002. 查找常用字符
     * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
     * 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
     * 你可以按任意顺序返回答案。 
     *
     * 示例 1：
     * 输入：["bella","label","roller"]
     * 输出：["e","l","l"]
     *
     * 示例 2：
     * 输入：["cool","lock","cook"]
     * 输出：["c","o"] 
     *
     * 提示：
     * 1 <= A.length <= 100
     * 1 <= A[i].length <= 100
     * A[i][j] 是小写字母
     */
    public List<String> commonChars(String[] A) {
        int[][] temp = new int[26][A.length];
        for (int i = 0; i < A.length; i++) {
            for (byte aByte : A[i].getBytes()) {
                temp[aByte - 97][i]++;
            }
        }
        List<String> list = new LinkedList<>();
        for (int i = 0; i < temp.length; i++) {
            int count = 100;
            for (int i1 = 0; i1 < A.length; i1++) {
                if(temp[i][i1]<count) count = temp[i][i1];
            }
            for (int j = 0; j < count; j++) {
                list.add(Character.toString((char)(i+97)));
            }
        }
        return list;
    }
}