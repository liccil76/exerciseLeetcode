package findContinuousSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 剑指 Offer 57 - II. 和为s的连续正数序列
     * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
     * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
     *
     * 示例 1：
     * 输入：target = 9
     * 输出：[[2,3,4],[4,5]]
     *
     * 示例 2：
     * 输入：target = 15
     * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
     *
     * 限制：
     * 1 <= target <= 10^5
     */
    //使用数学公式
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec = new ArrayList<>();
        for (int i = 1; i < target; i++) {
            double v = Math.pow(2 * i - 1, 2) + 8 * target;
            double sqrt = Math.sqrt(v);
            double n2 = (1-2*i + sqrt)/2;
            if(n2<=0.0) continue;
            if(Math.floor(n2) == Math.ceil(n2)){
                int count = i;
                int[] temp = new int[(int)n2];
                for (int i1 = 0; i1 < temp.length; i1++) {
                    temp[i1]=count;
                    count++;
                }
                vec.add(temp);
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }
    //双指针（使用等差数列中的公式）
    public int[][] findContinuousSequence2(int target) {
        return null;
    }
}