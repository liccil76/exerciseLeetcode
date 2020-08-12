package kthLargest;

public class Solution {
    /**
     * 给定一棵二叉搜索树，请找出其中第k大的节点。
     *
     * 示例 1:
     * 输入: root = [3,1,4,null,2], k = 1
     *    3
     *   / \
     *  1   4
     *   \
     *    2
     * 输出: 4
     *
     * 示例 2:
     * 输入: root = [5,3,6,2,4,null,null,1], k = 3
     *        5
     *       / \
     *      3   6
     *     / \
     *    2   4
     *   /
     *  1
     * 输出: 4
     *  
     * 限制：
     * 1 ≤ k ≤ 二叉搜索树元素个数
     */
    private int count;
    private int result;
    public int kthLargest(TreeNode root, int k) {
        count=k;
        temp(root);
        return result;
    }
    public void temp(TreeNode node){
        //中序遍历倒序
        if(node!=null){
            temp(node.right);
            if(count == 0) return;
            if(--count == 0) result = node.val;
            temp(node.left);
        }
    }
}