package threeConsecutiveOdds;

public class Solution {
    /**
     * 1550. 存在连续三个奇数的数组
     * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。 
     *
     * 示例 1：
     * 输入：arr = [2,6,4,1]
     * 输出：false
     * 解释：不存在连续三个元素都是奇数的情况。
     *
     * 示例 2：
     * 输入：arr = [1,2,34,3,4,5,7,23,12]
     * 输出：true
     * 解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。 
     *
     * 提示：
     * 1 <= arr.length <= 1000
     * 1 <= arr[i] <= 1000
     */
    public boolean threeConsecutiveOdds(int[] arr) {
        //双指针
        int a=0,b=0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if(val%2!=0){
                //奇数
                b++;
                int len = b-a;
                if(len>=3) return true;
            }else{
                int len = b-a;
                if(len>=3) return true;
                a=i;
                b=i;
            }
        }
        return false;
    }
}