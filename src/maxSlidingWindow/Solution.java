package maxSlidingWindow;

public class Solution {
    /**
     * 剑指 Offer 59 - I. 滑动窗口的最大值
     * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
     *
     * 示例:
     * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
     * 输出: [3,3,5,5,6,7]
     * 解释:
     *   滑动窗口的位置                最大值
     * ---------------               -----
     * [1  3  -1] -3  5  3  6  7       3
     *  1 [3  -1  -3] 5  3  6  7       3
     *  1  3 [-1  -3  5] 3  6  7       5
     *  1  3  -1 [-3  5  3] 6  7       5
     *  1  3  -1  -3 [5  3  6] 7       6
     *  1  3  -1  -3  5 [3  6  7]      7
     *
     * 提示：
     * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0) return new int[0];
        int[] result = new int[nums.length-k+1];
        int maxValueIndex = 0;
        int maxValue = nums[0];
        int start = 0;
        int end = k-1;
        //第一个窗口
        for (int i = 0; i < k; i++) {
            if(nums[i]>=maxValue){
                maxValueIndex = i;
                maxValue = nums[i];
            }
        }
        result[0]=maxValue;
        //接下来
        for (int i = 1; i < nums.length-k+1; i++) {
            start++;
            end++;
            if(start<=maxValueIndex){
                int num = nums[end];
                if(num>=maxValue){
                    maxValueIndex = end;
                    maxValue = nums[end];
                }
                result[i]=maxValue;
            }else{
                int num = nums[end];
                if(num>=maxValue){
                    maxValueIndex = end;
                    maxValue = nums[end];
                }else{
                    //重新计算
                    maxValueIndex = 0;
                    maxValue = -1;
                    for (int j = start; j <= end; j++) {
                        if(nums[j]>=maxValue){
                            maxValueIndex = j;
                            maxValue = nums[j];
                        }
                    }
                }
                result[i]=maxValue;
            }
        }
        return result;
    }
}