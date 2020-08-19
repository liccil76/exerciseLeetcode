package findSpecialInteger;

public class Solution {
    /**
     * 1287. 有序数组中出现次数超过25%的元素
     * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
     * 请你找到并返回这个整数 
     *
     * 示例：
     * 输入：arr = [1,2,2,6,6,6,6,7,10]
     * 输出：6
     *  
     * 提示：
     * 1 <= arr.length <= 10^4
     * 0 <= arr[i] <= 10^5
     */
    //直接遍历法
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int temp = arr[0];
        int count = 1;
        for (int i = 1; i < length; i++) {
            if(count * 4 > length) return temp;
            if(arr[i]==temp){
                count++;
            }else{
                count=1;
                temp=arr[i];
            }
        }
        return temp;
    }
}