package rob;

public class Solution {
    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋。
     * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间 相邻 的房屋在同一晚上被小偷闯入，系统会自动报警。
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你不触动警报装置的情况下，一夜之内能够偷窃到的最高金额。
     *  
     * 示例 1：
     * 输入：[1,2,3,1]
     * 输出：4
     * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     *      偷窃到的最高金额 = 1 + 3 = 4 。
     *
     * 示例 2：
     * 输入：[2,7,9,3,1]
     * 输出：12
     * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
     *  
     * 提示：
     * 0 <= nums.length <= 100
     * 0 <= nums[i] <= 400
     */
    public int rob(int[] nums) {
        int length = nums.length;
        if(length==0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        if(length==2){
            return Math.max(nums[0],nums[1]);
        }
        int a = nums[0];
        int b = Math.max(nums[0],nums[1]);
        int max = b;
        for (int i = 2; i < length; i++) {
            int temp = b;
            b = Math.max(nums[i] + a, b);
            a=temp;
            max = Math.max(max,b);
        }
        return max;
    }
}
