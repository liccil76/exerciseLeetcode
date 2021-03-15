package inorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    /**
     * 94. 二叉树的中序遍历
     * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
     * <p>
     * 示例 1：
     * 输入：root = [1,null,2,3]
     * 输出：[1,3,2]
     * <p>
     * 示例 2：
     * 输入：root = []
     * 输出：[]
     * <p>
     * 示例 3：
     * 输入：root = [1]
     * 输出：[1]
     * <p>
     * 示例 4：
     * 输入：root = [1,2]
     * 输出：[2,1]
     * <p>
     * 示例 5：
     * 输入：root = [1,null,2]
     * 输出：[1,2]
     * <p>
     * 提示：
     * 树中节点数目在范围 [0, 100] 内
     * -100 <= Node.val <= 100
     * <p>
     * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            if (pop.left == null && pop.right == null) list.add(pop.val);
            if (pop.right != null) {
                stack.add(pop.right);
            }
            TreeNode left = pop.left;
            if(pop.left!=null || pop.right!=null){
                pop.left=null;
                pop.right=null;
                stack.add(pop);
            }
            if (left != null) {
                stack.add(left);
            }
        }
        return list;
    }
}
