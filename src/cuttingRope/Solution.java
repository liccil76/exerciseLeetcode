package cuttingRope;

/**
 * @author lichen
 * @since 2021/6/7 19:57
 */
public class Solution {
    /**
     * 剑指 Offer 14- I. 剪绳子
     * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
     * 请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
     * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
     * <p>
     * 示例 1：
     * 输入: 2
     * 输出: 1
     * 解释: 2 = 1 + 1, 1 × 1 = 1
     * <p>
     * 示例 2:
     * 输入: 10
     * 输出: 36
     * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
     * <p>
     * 提示：
     * 2 <= n <= 58
     */
    //周长一定，找乘积最大值
    //数学法
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }

    public static void main(String[] args) {
        int i = new Solution().cuttingRope(2);
        System.out.println(i);
    }
}
