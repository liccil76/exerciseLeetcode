package waysToStep;

public class Solution {
    /**
     * 三步问题。
     * 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。
     * 实现一种方法，计算小孩有多少种上楼梯的方式。
     * 结果可能很大，你需要对结果模1000000007。
     *
     * 示例1:
     *  输入：n = 3
     *  输出：4
     *  说明: 有四种走法
     *
     * 示例2:
     *  输入：n = 5
     *  输出：13
     *
     * 提示:
     * n范围在[1, 1000000]之间
     */
    public int waysToStep(int n) {
        long a = 1;
        long b = 2;
        long c = 4;
        if(n==1){
            return (int)a;
        }
        if(n==2){
            return (int)b;
        }
        if(n==3){
            return (int)c;
        }
        long res = 0;
        for (int i = 4; i <= n; i++) {
            res = (c+b+a)%1000000007;
            a=b;
            b=c;
            c=res;
        }
        return (int)res;
    }
}
