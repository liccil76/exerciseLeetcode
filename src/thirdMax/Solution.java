package thirdMax;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * 414. 第三大的数
     * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
     *
     * 示例 1:
     * 输入: [3, 2, 1]
     * 输出: 1
     * 解释: 第三大的数是 1.
     *
     * 示例 2:
     * 输入: [1, 2]
     * 输出: 2
     * 解释: 第三大的数不存在, 所以返回最大的数 2 .
     *
     * 示例 3:
     * 输入: [2, 2, 3, 1]
     * 输出: 1
     * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
     * 存在两个值为2的数，它们都排第二。
     */
    //方法一，遍历过程中处理
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            if(num>first){
                third = second;
                second = first;
                first = num;
            }else if(num>second&&num<first){
                third = second;
                second = num;
            }else if(num<second&&num>third){
                third = num;
            }
        }
        return first!=second&&second!=third&&first!=third&&set.contains(third) ? third : first;
    }
    //方法二，先排序，后处理
    public int thirdMax2(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if(!set.contains(nums[i])){
                if(set.size()==2) return nums[i];
                set.add(nums[i]);
            }
        }
        return nums[nums.length-1];
    }
    //方法三
    public int thirdMax3(int[] nums) {
        Arrays.sort(nums);
        int count =2;
        int target = nums[nums.length-1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if(nums[i]!=nums[i+1]){
                target = nums[i];
                if(--count==0) return target;
            }
        }
        return nums[nums.length-1];
    }
    //方法四
    public int thirdMax4(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if(num>first){
                third = second;
                second = first;
                first = num;
            }else if(num>second&&num<first){
                third = second;
                second = num;
            }else if(num<second&&num>third){
                third = num;
            }
        }
        return third!=Long.MIN_VALUE ? new Long(third).intValue() : new Long(first).intValue();
    }
}