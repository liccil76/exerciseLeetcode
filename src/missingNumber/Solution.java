package missingNumber;

public class Solution {
    /**
     * 268. 缺失数字
     * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。 
     *
     * 示例 1:
     * 输入: [3,0,1]
     * 输出: 2
     *
     * 示例 2:
     * 输入: [9,6,4,2,3,5,7,0,1]
     * 输出: 8
     *
     * 说明:
     * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
     */
    public int missingNumber(int[] nums) {
        int[] results = new int[nums.length+1];
        for (int num : nums) results[num] = num;
        for (int i = 0; i < results.length; i++) if(results[i]==0&&i!=0) return i;
        return 0;
    }
}