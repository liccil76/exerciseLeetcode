package exchange;

public class Solution {
    /**
     * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
     *
     * 示例：
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,2,4]
     * 注：[3,1,2,4] 也是正确的答案之一。
     *
     * 提示：
     * 1 <= nums.length <= 50000
     * 1 <= nums[i] <= 10000
     */
    public int[] exchange(int[] nums) {
        int head = 0;
        int tail = nums.length-1;
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if(num%2==0){
                arr[tail--]=num;
            }else{
                arr[head++]=num;
            }
        }
        return arr;
    }
}