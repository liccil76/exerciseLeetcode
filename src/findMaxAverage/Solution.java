package findMaxAverage;

public class Solution {
    /**
     * 643. 子数组最大平均数 I
     * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
     *
     * 示例 1:
     * 输入: [1,12,-5,-6,50,3], k = 4
     * 输出: 12.75
     * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
     *  
     * 注意:
     * 1 <= k <= n <= 30,000。
     * 所给数据范围 [-10,000，10,000]。
     */
    public double findMaxAverage(int[] nums, int k) {
        //先将数组中的前k个数求和
        int sum = 0;
        int head = nums[0];
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum-head+nums[i];
            maxSum = Math.max(maxSum,sum);
            head = nums[i-k+1];
        }
        return maxSum*1.0/k;
    }
}