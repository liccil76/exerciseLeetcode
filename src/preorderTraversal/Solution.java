package preorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    /**
     * 144. 二叉树的前序遍历
     * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
     * <p>
     * 示例 1：
     * 输入：root = [1,null,2,3]
     * 输出：[1,2,3]
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
     * 输出：[1,2]
     * <p>
     * 示例 5：
     * 输入：root = [1,null,2]
     * 输出：[1,2]
     * <p>
     * 提示：
     * 树中节点数目在范围 [0, 100] 内
     * -100 <= Node.val <= 100
     * <p>
     * 进阶：递归算法很简单，你可以通过迭代算法完成吗？
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            //右 左 中的顺序入栈
            TreeNode node = stack.pop();
            if (node.left == null && node.right == null) list.add(node.val);
            if (node.right != null) stack.add(node.right);
            if (node.left != null) stack.add(node.left);
            if (node.left != null || node.right != null) {
                node.left = null;
                node.right = null;
                stack.add(node);
            }
        }
        return list;
    }
}
