package getLeastNumbers;

public class Solution {
    /**
     * 剑指 Offer 40. 最小的k个数
     * 输入整数数组 arr ，找出其中最小的 k 个数。
     * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
     *
     * 示例 1：
     * 输入：arr = [3,2,1], k = 2
     * 输出：[1,2] 或者 [2,1]
     *
     * 示例 2：
     * 输入：arr = [0,1,2,1], k = 1
     * 输出：[0]
     *
     * 限制：
     * 0 <= k <= arr.length <= 10000
     * 0 <= arr[i] <= 10000
     */
    //使用value数组
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        int[] temp = new int[10001];
        for (int i : arr) temp[i]++;
        int count = 0;
        int index = 0;
        int rIndex = 0;
        LabelA:while (true){
            if(count>=k) break;
            int i = temp[index];
            if(i!=0){
                for (int j = 0; j < i; j++) {
                    if(count<k){
                        result[rIndex++]=index;
                        count ++;
                    }else {
                        break LabelA;
                    }
                }
            }
            index++;
        }
        return result;
    }
}