package dominantIndex;

public class Solution {
    /**
     * 747. 至少是其他数字两倍的最大数
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * 如果是，则返回最大元素的索引，否则返回-1。
     *
     * 示例 1:
     * 输入: nums = [3, 6, 1, 0]
     * 输出: 1
     * 解释: 6是最大的整数, 对于数组中的其他整数,
     * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
     *
     * 示例 2:
     * 输入: nums = [1, 2, 3, 4]
     * 输出: -1
     * 解释: 4没有超过3的两倍大, 所以我们返回 -1. 
     *
     * 提示:
     * nums 的长度范围在[1, 50].
     * 每个 nums[i] 的整数范围在 [0, 100].
     */
    //一次循环
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                if(max*2<=nums[i]){
                    index = i;
                }else{
                    index = -1;
                }
                max = nums[i];
            }else if(nums[i]<max){
                if(nums[i]*2>max){
                    index = -1;
                }
            }
        }
        return index;
    }
    //线性扫描
    public int dominantIndex2(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i]) return -1;
        }
        return maxIndex;
    }
}