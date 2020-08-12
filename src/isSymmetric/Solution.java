package isSymmetric;

public class Solution {
    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     *
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     *  
     * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
     *     1
     *    / \
     *   2   2
     *    \   \
     *    3    3
     *  
     * 进阶：
     * 你可以运用递归和迭代两种方法解决这个问题吗？
     */
    private boolean result = true;
    public boolean isSymmetric(TreeNode root) {
        if(root!=null){
            temp(root.left,root.right);
        }
        return result;
    }

    public void temp(TreeNode left,TreeNode right){
        if(
                (left == null && right != null) ||
                (right == null && left != null) ||
                (left != null && right != null && left.val != right.val)
        ){
            result=false;
            return;
        }
        if(left == null && right == null){
            return;
        }
        temp(left.left,right.right);
        temp(left.right,right.left);
    }
}