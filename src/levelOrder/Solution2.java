package levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    /**
     * 剑指 Offer 32 - I. 从上到下打印二叉树
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     *
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回：
     * [3,9,20,15,7]
     *
     * 提示：
     * 节点总数 <= 1000
     */
    public int[] levelOrder(TreeNode root) {
        //bfs（广度优先遍历）
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                res.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }
}
