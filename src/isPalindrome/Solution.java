package isPalindrome;

public class Solution {
    /**
     * 125. 验证回文串
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     *
     * 示例 1:
     * 输入: "A man, a plan, a canal: Panama"
     * 输出: true
     *
     * 示例 2:
     * 输入: "race a car"
     * 输出: false
     */
    public boolean isPalindrome(String s) {
        byte[] bytes = s.getBytes();
        int index = bytes.length-1;
        for (byte c : bytes) {
            if (
                    (c >= 48 && c <= 57) ||
                    (c >= 65 && c <= 90) ||
                    (c >= 97 && c <= 122)
            ) {
                while (index >= 0) {
                    byte c1 = bytes[index];
                    if (
                            (c1 >= 48 && c1 <= 57) ||
                            (c1 >= 65 && c1 <= 90) ||
                            (c1 >= 97 && c1 <= 122)
                    ) {
                        if (c1 == c || (c>=65 && c1>=65 && (c-c1==32 || c1-c==32))) {
                            index--;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        index--;
                    }
                }
            }
        }
        return true;
    }
}
