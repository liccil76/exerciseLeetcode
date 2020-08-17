package findShortestSubArray;

import java.util.*;

public class Solution {
    /**
     * 697. 数组的度
     * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
     * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
     *
     * 示例 1:
     * 输入: [1, 2, 2, 3, 1]
     * 输出: 2
     * 解释:
     * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
     * 连续子数组里面拥有相同度的有如下所示:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * 最短连续子数组[2, 2]的长度为2，所以返回2.
     *
     * 示例 2:
     * 输入: [1,2,2,3,1,4,2]
     * 输出: 6
     *
     * 注意:
     * nums.length 在1到50,000区间范围内。
     * nums[i] 是一个在0到49,999范围内的整数。
     */
    public int findShortestSubArray(int[] nums) {
        //找到出现频数最高的元素，并统计其第一次和最后一次出现的index，取其差值的绝对值
        Map<Integer, List<Integer>> map = new HashMap<>();
        int maxSize = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            if(map.get(nums[i])!=null){
                list = map.get(nums[i]);
            }
            list.add(i);
            map.put(nums[i],list);
            maxSize=Math.max(maxSize,list.size());
        }
        Set<Map.Entry<Integer, List<Integer>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<Integer>> entry : entries) {
            List<Integer> value = entry.getValue();
            if(value.size()==maxSize){
                minLength=Math.min(minLength,value.get(value.size()-1)-value.get(0)+1);
            }
        }
        return minLength;
    }
}