package isSubtree;

public class Solution {
    /**
     * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
     * s 的一个子树包括 s 的一个节点和这个节点的所有子孙。
     * s 也可以看做它自身的一棵子树。
     *
     * 示例 1:
     * 给定的树 s:
     *      3
     *     / \
     *    4   5
     *   / \
     *  1   2
     * 给定的树 t：
     *    4
     *   / \
     *  1   2
     * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
     *
     * 示例 2:
     * 给定的树 s：
     *      3
     *     / \
     *    4   5
     *   / \
     *  1   2
     *     /
     *    0
     * 给定的树 t：
     *    4
     *   / \
     *  1   2
     * 返回 false。
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;  // 这里 t 一定不为 null, 只要 s 为 null，肯定是 false
        if (t == null) return true;   // t 为 null 一定都是 true
        return isSubtree(s.left, t) || isSubtree(s.right, t) || isSameTree(s,t);
    }
    /**
     * 判断两棵树是否相同
     */
    public boolean isSameTree(TreeNode s, TreeNode t){
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
