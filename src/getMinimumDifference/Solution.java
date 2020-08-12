package getMinimumDifference;

public class Solution {
    /**
     * 给你一棵所有节点为非负值的二叉搜索树
     * 请你计算树中任意两节点的差的绝对值的最小值。
     *
     * 示例：
     * 输入：
     *    1
     *     \
     *      3
     *     /
     *    2
     * 输出：
     * 1
     * 解释：
     * 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
     *
     * 提示：
     * 树中至少有 2 个节点。
     * 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/ 相同
     */
    private TreeNode pre = null;
    private int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        temp(root);
        return min;
    }
    public void temp(TreeNode node){
        if(node!=null){
            temp(node.left);
            if(pre!=null){
                min = Math.min(min,Math.abs(node.val-pre.val));
            }
            pre = node;
            temp(node.right);
        }
    }
}