package replaceElements;

public class Solution {
    /**
     * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
     * 完成所有替换操作后，请你返回这个数组。
     *
     * 示例：
     * 输入：arr = [17,18,5,4,6,1]
     * 输出：[18,6,6,6,1,-1]
     *
     * 提示：
     * 1 <= arr.length <= 10^4
     * 1 <= arr[i] <= 10^5
     */
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        result[length - 1] = -1;
        for (int i = length - 2; i >= 0; i--) {
            result[i] = Math.max(result[i+1],arr[i+1]);
        }
        return result;
    }
}