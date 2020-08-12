package maxSubArray;

public class Solution {

    /**
     * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     *
     * 要求时间复杂度为O(n)。
     *
     * 示例1:
     * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     *
     * 提示：
     * 1 <= arr.length <= 10^5
     * -100 <= arr[i] <= 100
     */
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            //求以i为右节点的和最大的子数组的和的值
            nums[i] += Math.max(nums[i - 1], 0);
            //将存储的最大值和以i为右节点的和最大的子数组的和的值进行比较，将两者中的最大值替换最大值
            res = Math.max(res, nums[i]);
        }
        return res;
    }

}
