package relativeSortArray;

import java.util.*;

public class Solution {
    /**
     * 1122. 数组的相对排序
     * 给你两个数组，arr1 和 arr2，
     * arr2 中的元素各不相同
     * arr2 中的每个元素都出现在 arr1 中
     * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。
     * 未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
     *
     * 示例：
     * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
     * 输出：[2,2,2,1,4,3,3,9,6,7,19]
     *  
     * 提示：
     * arr1.length, arr2.length <= 1000
     * 0 <= arr1[i], arr2[i] <= 1000
     * arr2 中的元素 arr2[i] 各不相同
     * arr2 中的每个元素 arr2[i] 都出现在 arr1 中
     */
    //常规解法
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int value : arr1) {
            map.put(value,map.getOrDefault(value,0)+1);
        }
        int temp = 0;
        for (int value : arr2) {
            Integer times = map.get(value);
            for (int i = 0; i < times; i++) {
                arr1[temp++]=value;
            }
            map.remove(value);
        }
        List<Integer> list = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int times = entry.getValue();
            for (int i = 0; i < times; i++) {
                list.add(entry.getKey());
            }
        }
        list.sort((o1, o2) -> o1-o2);
        for (Integer integer : list) {
            arr1[temp++]=integer;
        }
        return arr1;
    }
    //使用临时数组
    public int[] relativeSortArray2(int[] arr1, int[] arr2) {
        int[] temp = new int[1001];
        for (int i : arr1) {
            temp[i]++;
        }
        int index = 0;
        for (int i : arr2) {
            while (temp[i]>0){
                arr1[index++]=i;
                temp[i]--;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            while (temp[i]>0){
                arr1[index++] = i;
                temp[i]--;
            }
        }
        return arr1;
    }
}