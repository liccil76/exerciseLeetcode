package rangeSumBST;

public class Solution {
    /**
     * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
     * 二叉搜索树保证具有唯一的值。
     *
     * 示例 1：
     * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
     * 输出：32
     *
     * 示例 2：
     * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
     * 输出：23
     *  
     * 提示：
     * 树中的结点数量最多为 10000 个。
     * 最终的答案保证小于 2^31。
     */
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        temp(root,L,R);
        return sum;
    }
    public void temp(TreeNode node,int L,int R){
        //根据二叉搜索树的特性进行选择性遍历
        if(node!=null){
            if(node.val >= L && node.val <= R){
                sum += node.val;
                temp(node.left,L,R);
                temp(node.right,L,R);
            }else if(node.val < L){
                temp(node.right,L,R);
            }else if(node.val > R){
                temp(node.left,L,R);
            }
        }
    }
}