package plusOne;

public class Solution {
    /**
     * 66. 加一
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * 示例 1:
     * 输入: [1,2,3]
     * 输出: [1,2,4]
     * 解释: 输入数组表示数字 123。
     *
     * 示例 2:
     * 输入: [4,3,2,1]
     * 输出: [4,3,2,2]
     * 解释: 输入数组表示数字 4321。
     */
    public int[] plusOne(int[] digits) {
        int temp = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int a = digits[i]+temp;
            if(i==digits.length-1) a = digits[i]+1+temp;
            temp = a/10;
            digits[i]=a%10;
        }
        if(temp==0) return digits;
        int[] result = new int[digits.length+1];
        result[0]=temp;
        return result;
    }
}