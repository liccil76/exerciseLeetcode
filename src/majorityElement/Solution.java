package majorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 169. 多数元素
     * 给定一个大小为 n 的数组，找到其中的多数元素。
     * 多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     * 示例 1:
     * 输入: [3,2,3]
     * 输出: 3
     *
     * 示例 2:
     * 输入: [2,2,1,1,1,2,2]
     * 输出: 2
     */
    //哈希表法
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int stand = nums.length/2;
        for (int num : nums) {
            int temp = map.get(num)==null ? 0 : map.get(num);
            if (temp >= stand) {
                result = num;
                break;
            }
            map.put(num,temp+1);
        }
        return result;
    }
    //排序法
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}