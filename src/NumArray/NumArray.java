package NumArray;

import java.util.HashMap;
import java.util.Map;

public class NumArray {
    /**
     * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
     *
     * 示例：
     * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
     * sumRange(0, 2) -> 1
     * sumRange(2, 5) -> -1
     * sumRange(0, 5) -> -3
     *
     * 说明:
     * 你可以假设数组不可变。
     * 会多次调用 sumRange 方法。
     *
     */
    private Map<Integer,Integer> map = new HashMap<>();

    public NumArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            if(map.get(i-1) != null){
                sum = nums[i] + map.get(i-1);
            }else{
                sum = nums[i];
            }
            map.put(i,sum);
        }
    }

    public int sumRange(int i, int j) {
        int result = 0;

        result = map.get(j) - (map.get(i-1) == null ? 0 : map.get(i-1));

        return result;
    }

    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(i,j);
     */
}