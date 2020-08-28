package moveZeroes;

public class Solution {
    /**
     * 283. 移动零
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 示例:
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     *
     * 说明:
     * 必须在原数组上操作，不能拷贝额外的数组。
     * 尽量减少操作次数。
     */
    //双指针
    public void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        while (i<nums.length || index<nums.length) {
            if(i<nums.length){
                if (nums[i] != 0 && i!=index) {
                    nums[index++] = nums[i];
                }
                i++;
            }else{
                for (; index < nums.length; index++) {
                    nums[index]=0;
                }
            }
        }
    }
}