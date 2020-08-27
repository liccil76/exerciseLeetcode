package findKthPositive;

public class Solution {
    /**
     * 1539. 第 k 个缺失的正整数
     * 给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
     * 请你找到这个数组里第 k 个缺失的正整数。 
     *
     * 示例 1：
     * 输入：arr = [2,3,4,7,11], k = 5
     * 输出：9
     * 解释：缺失的正整数包括 [1,5,6,8,9,10,12,13,...] 。第 5 个缺失的正整数为 9 。
     *
     * 示例 2：
     * 输入：arr = [1,2,3,4], k = 2
     * 输出：6
     * 解释：缺失的正整数包括 [5,6,7,...] 。第 2 个缺失的正整数为 6 。
     *
     * 提示：
     * 1 <= arr.length <= 1000
     * 1 <= arr[i] <= 1000
     * 1 <= k <= 1000
     * 对于所有 1 <= i < j <= arr.length 的 i 和 j 满足 arr[i] < arr[j] 
     */
    public int findKthPositive(int[] arr, int k) {
        int temp = 1;
        int index = 0;
        while (true){
            if(index<arr.length){
                int value = arr[index];
                while (temp < value) {
                    if(k==1) return temp;
                    temp++;
                    k--;
                }
                temp = value+1;
                index++;
            }else{
                if(k==1) return temp;
                temp++;
                k--;
            }
        }
    }

    public int findKthPositive2(int[] arr, int k) {
        int i,n = arr.length;
        for(i=0;i<n;i++){
            if(arr[i]-i-1>=k){
                return k+i;
            }
        }
        return k+i;
    }

    public int findKthPositive3(int[] arr, int k) {
        int left = 0, right = arr.length, mid = 0;
        while(left<right){
            mid = left + (right-left)/2;
            if(arr[mid]-mid >= k+1){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return k + left;
    }

}