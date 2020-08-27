package rotate;

public class Solution {
    /**
     * 189. 旋转数组
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     *
     * 示例 1:
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     *
     * 示例 2:
     * 输入: [-1,-100,3,99] 和 k = 2
     * 输出: [3,99,-1,-100]
     * 解释:
     * 向右旋转 1 步: [99,-1,-100,3]
     * 向右旋转 2 步: [3,99,-1,-100]
     *
     * 说明:
     * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
     * 要求使用空间复杂度为 O(1) 的 原地 算法。
     */
    //方法一，原地修改（嵌套遍历）
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k%3; i++) {
            int temp = nums[nums.length-1];
            for (int i1 = nums.length - 1; i1 >= 1; i1--) {
                nums[i1]=nums[i1-1];
            }
            nums[0] = temp;
        }
    }
    //方法二，使用额外数组
    public void rotate2(int[] nums, int k) {
        k = k%nums.length;
        int[] result = new int[k];
        int index = 0;
        for (int i = nums.length-k; i < nums.length; i++) {
            result[index++] = nums[i];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i-k];
        }
        for (int i = 0; i < result.length; i++) {
            nums[i]=result[i];
        }
    }
    //方法三，使用反转
    public void rotate3(int[] nums, int k) {
        k %= nums.length;
        //整个数组全部反转
        reverse(nums,0,nums.length-1);
        //前k个元素反转
        reverse(nums,0,k-1);
        //后nums.length-k个元素反转
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int head,int tail){
        while (head<tail){
            nums[head] = nums[head]^nums[tail];
            nums[tail] = nums[head]^nums[tail];
            nums[head] = nums[head]^nums[tail];
            head++;
            tail--;
        }
    }
}