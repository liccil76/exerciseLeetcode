package minimumAbsDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * 1200. 最小绝对差
     * 给你个整数数组 arr，其中每个元素都 不相同。
     * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
     *
     * 示例 1：
     * 输入：arr = [4,2,1,3]
     * 输出：[[1,2],[2,3],[3,4]]
     *
     * 示例 2：
     * 输入：arr = [1,3,6,10,15]
     * 输出：[[1,3]]
     *
     * 示例 3：
     * 输入：arr = [3,8,-10,23,19,-4,-14,27]
     * 输出：[[-14,-10],[19,23],[23,27]] 
     *
     * 提示：
     * 2 <= arr.length <= 10^5
     * -10^6 <= arr[i] <= 10^6
     */
    //方法一
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //排序
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff,arr[i]-arr[i-1]);
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[i-1]==minDiff){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                lists.add(list);
            }
        }
        return lists;
    }
    //方法二
    public List<List<Integer>> minimumAbsDifference2(int[] arr) {
        //排序
        Arrays.sort(arr);
        List<List<Integer>> lists = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(minDiff<arr[i]-arr[i-1]){
                continue;
            }else if(minDiff==arr[i]-arr[i-1]){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                lists.add(list);
            }else{
                //minDiff>arr[i]-arr[i-1]
                lists.clear();
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                lists.add(list);
                minDiff=arr[i]-arr[i-1];
            }
        }
        return lists;
    }
    //方法三，网上大神写的，不知道为什么执行时间0ms，为什么这里厉害呢？
    public List<List<Integer>> minimumAbsDifference3(int[] arr) {
        return new java.util.AbstractList<List<Integer>>() {
            int[] buffer;
            int size;
            int min;
            boolean init;
            private void init() {
                Arrays.sort(arr);
                buffer = new int[arr.length];
                min = Integer.MAX_VALUE;
                for(int i = 1; i < arr.length; i++) {
                    int dif = arr[i] - arr[i - 1];
                    if(dif > min) {
                        continue;
                    }
                    if(dif < min) {
                        size = 0;
                        min = dif;
                    }
                    buffer[size++] = arr[i];
                }
                init = true;
            }
            // 缺少范围检查
            @Override
            public List<Integer> get(int index) {
                if(!init) {
                    init();
                }
                return Arrays.asList(buffer[index] - min, buffer[index]);
            }
            @Override
            public int size() {
                if(!init) {
                    init();
                }
                return size;
            }
        };
    }
}