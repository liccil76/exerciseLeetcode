package arrayPairSum;

import java.util.Arrays;

public class Solution {
    /**
     * 561. 数组拆分 I
     * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
     *
     * 示例 1:
     * 输入: [1,4,3,2]
     * 输出: 4
     * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
     *
     * 提示:
     * n 是正整数,范围在 [1, 10000].
     * 数组中的元素范围在 [-10000, 10000].
     */
    //方法一，排序
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    //方法二，使用额外空间，计数排序
    public int arrayPairSum2(int[] nums) {
        int[] temp = new int[20001];
        int diff = 10000;
        for (int num : nums) {
            temp[num+diff]++;
        }
        int d = 0, sum = 0;
        for (int i = -10000; i <= 10000; i++) {
            int times = temp[i + diff];
            sum += (times + 1 - d) / 2 * i;
            d = (2 + times - d) % 2;
        }
        return sum;
    }
}