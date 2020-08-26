package arrayRankTransform;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 1331. 数组序号转换
     * 给你一个整数数组 arr ，请你将数组中的每个元素替换为它们排序后的序号。
     * 序号代表了一个元素有多大。序号编号的规则如下：
     * 序号从 1 开始编号。
     * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
     * 每个数字的序号都应该尽可能地小。 
     *
     * 示例 1：
     * 输入：arr = [40,10,20,30]
     * 输出：[4,1,2,3]
     * 解释：40 是最大的元素。 10 是最小的元素。 20 是第二小的数字。 30 是第三小的数字。
     *
     * 示例 2：
     * 输入：arr = [100,100,100]
     * 输出：[1,1,1]
     * 解释：所有元素有相同的序号。
     *
     * 示例 3：
     * 输入：arr = [37,12,28,9,100,56,80,5,12]
     * 输出：[5,3,4,2,8,6,7,1,3]
     *
     * 提示：
     * 0 <= arr.length <= 105
     * -109 <= arr[i] <= 109
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        System.arraycopy(arr,0,result,0,arr.length);
        Arrays.sort(result);
        Map<Integer,Integer> map = new HashMap<>();
        int pre = -110;
        int index = 0;
        for (int value : result) {
            if(value!=pre){
                pre=value;
                index++;
                map.put(value,index);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result[i]=map.get(arr[i]);
        }
        return result;
    }
    //桶排序
    public int[] arrayRankTransform2(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num : arr){                        //找最大最小值
            if(num < min) min = num;
            if(num > max) max = num;
        }
        int[] count = new int[max-min+1];          //最多存在 max-min+1 个不同元素
        for(int num : arr) count[num-min] = 1;     //初次遍历，找到存在的元素
        for(int i = 1; i < count.length; i++){     //二次遍历，对存在的元素进行排序
            count[i] = count[i-1] + count[i];
        }
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[i] = count[arr[i]-min];            //count数组存放着对应的排序后索引
        }
        return res;
    }
}