package sumOfLeftLeaves;

public class Solution {
    /**
     * 计算给定二叉树的所有左叶子之和。
     *
     * 示例：
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
     */
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        temp(root,false);
        return sum;
    }
    public void temp(TreeNode node,boolean add){
        if(node==null){
            return;
        }
        if(add && node.left==null && node.right==null){
            sum += node.val;
        }
        temp(node.left,true);
        temp(node.right,false);
    }
}