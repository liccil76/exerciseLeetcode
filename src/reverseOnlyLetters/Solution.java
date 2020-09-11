package reverseOnlyLetters;

public class Solution {
    /**
     * 917. 仅仅反转字母
     * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。 
     *
     * 示例 1：
     * 输入："ab-cd"
     * 输出："dc-ba"
     *
     * 示例 2：
     * 输入："a-bC-dEf-ghIj"
     * 输出："j-Ih-gfE-dCba"
     *
     * 示例 3：
     * 输入："Test1ng-Leet=code-Q!"
     * 输出："Qedo1ct-eeLg=ntse-T!"
     *
     * 提示：
     * S.length <= 100
     * 33 <= S[i].ASCIIcode <= 122 
     * S 中不包含 \ or "
     */
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = S.getBytes();
        int index = bytes.length - 1;
        for (byte aByte : bytes) {
            if ((aByte >= 65 && aByte <= 90) || (aByte >= 97 && aByte <= 122)) {
                while (index >= 0) {
                    if ((bytes[index] >= 65 && bytes[index] <= 90) || (bytes[index] >= 97 && bytes[index] <= 122)) {
                        sb.append((char) bytes[index]);
                        index--;
                        break;
                    } else {
                        index--;
                    }
                }
            } else {
                sb.append((char) aByte);
            }
        }
        return sb.toString();
    }
}