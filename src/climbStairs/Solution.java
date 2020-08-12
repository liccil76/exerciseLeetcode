package climbStairs;

public class Solution {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     *
     * 示例 2：
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     */
    /**
     * 斐波那契数列求解
     */
    public int climbStairs(int n) {
//        //个人解法（动态规划）
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        map.put(1,2);
//        int sum = 0;
//        if(n<3){
//            return map.get(n-1);
//        }
//        for (int i = 2; i < n; i++) {
//            sum = map.get(i-1)+map.get(i-2);
//            map.put(i,sum);
//        }
//        return sum;
//        //官方解法（动态规划）
//        int p = 0, q = 0, r = 1;
//        for (int i = 1; i <= n; ++i) {
//            p = q;
//            q = r;
//            r = p + q;
//        }
//        return r;
        //官方解法（通项公式）
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int)(fibn / sqrt5);
    }
}