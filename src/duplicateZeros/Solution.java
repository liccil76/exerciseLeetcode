package duplicateZeros;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
     * 注意：请不要在超过该数组长度的位置写入元素。
     * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。 
     *
     * 示例 1：
     * 输入：[1,0,2,3,0,4,5,0]
     * 输出：null
     * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
     *
     * 示例 2：
     * 输入：[1,2,3]
     * 输出：null
     * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
     *
     * 提示：
     * 1 <= arr.length <= 10000
     * 0 <= arr[i] <= 9
     */
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int count = arr.length;
        boolean firstMeet = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(count<=0) break;
            if(arr[i]==0){
                if(!firstMeet){
                    index=i;
                    firstMeet=true;
                }
                queue.add(arr[i]);
                queue.add(arr[i]);
                count-=2;
            }else{
                if(firstMeet) queue.add(arr[i]);
                count-=1;
            }
        }
        if(index==-1) return;
        for (int i = index; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
    }
}