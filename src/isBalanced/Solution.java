package isBalanced;

public class Solution {
    /**
     * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
     *
     * 示例 1:
     * 给定二叉树 [3,9,20,null,null,15,7]
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回 true 。
     *
     * 示例 2:
     * 给定二叉树 [1,2,2,3,3,null,null,4,4]
     *       1
     *      / \
     *     2   2
     *    / \
     *   3   3
     *  / \
     * 4   4
     * 返回 false 。
     */
    //dfs+dp（父节点的平衡性根据子节点得到，避免重复计算）
    private boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }
    private int dfs(TreeNode n){
        if(n == null || !flag){
            return 0;
        }
        int leftDepth = dfs(n.left)+1;
        int rightDepth = dfs(n.right)+1;
        if(Math.abs(leftDepth-rightDepth) > 1){
            flag = false;
        }
        return Math.max(leftDepth,rightDepth);
    }
}
