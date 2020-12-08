package singleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution2 {
    /**
     * 剑指 Offer 56 - II. 数组中数字出现的次数 II
     * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。
     * 请找出那个只出现一次的数字。
     *
     * 示例 1：
     * 输入：nums = [3,4,3,3]
     * 输出：4
     *
     * 示例 2：
     * 输入：nums = [9,1,7,9,7,9,7]
     * 输出：1
     *
     * 限制：
     * 1 <= nums.length <= 10000
     * 1 <= nums[i] < 2^31
     */
    //hash表法（耗时15ms）
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue().equals(1)) return entry.getKey();
        }
        return 0;
    }
    /**
     * 位运算
     * 总体思路：考虑数字的二进制形式，对于出现三次的数字，各 二进制位 出现的次数都是 3 的倍数。
     *          因此，统计所有数字的各二进制位中 1 的出现次数，并对 3 求余，结果则为只出现一次的数字
     * 自动状态机（大佬解法，看不懂啊）
     */
    public int singleNumber2(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}