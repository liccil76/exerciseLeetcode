package searchRange;

public class Solution {
    /**
     * 34. 在排序数组中查找元素的第一个和最后一个位置
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     * <p>
     * 进阶：
     * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
     * <p>
     * 示例 1：
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     * <p>
     * 示例 2：
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     * <p>
     * 示例 3：
     * 输入：nums = [], target = 0
     * 输出：[-1,-1]
     * <p>
     * 提示：
     * 0 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * nums 是一个非递减数组
     * -109 <= target <= 109
     */
    //双指针
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (result[0] != -1 && result[1] != -1) break;
            if (result[0] == -1) {
                if (nums[start] == target) {
                    result[0] = start;
                    continue;
                } else {
                    start++;
                }
            }
            if (result[1] == -1) {
                if (nums[end] == target) {
                    result[1] = end;
                    continue;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
