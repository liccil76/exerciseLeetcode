package singleNumbers;

public class Solution {
    /**
     * 剑指 Offer 56 - I. 数组中数字出现的次数
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     *
     * 示例 1：
     * 输入：nums = [4,1,4,6]
     * 输出：[1,6] 或 [6,1]
     *
     * 示例 2：
     * 输入：nums = [1,2,10,4,1,4,3,3]
     * 输出：[2,10] 或 [10,2]
     *
     * 限制：
     * 2 <= nums.length <= 10000
     */
    //使用数组
    public int[] singleNumbers(int[] nums) {
        int[] arr = new int[10001];
        for (int num : nums) {
            arr[num]++;
        }
        int index = 0;
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(index==2) break;
            if(arr[i]==1) result[index++]=i;
        }
        return result;
    }
    //官方解法，分组异或
    public int[] singleNumbers2(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}