package isUnivalTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
     * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
     *
     * 示例 1：
     * 输入：[1,1,1,1,1,null,1]
     * 输出：true
     *
     * 示例 2：
     * 输入：[2,2,2,5,2]
     * 输出：false
     *
     * 提示：
     * 给定树的节点数范围是 [1, 100]。
     * 每个节点的值都是整数，范围为 [0, 99] 。
     */
    public boolean isUnivalTree(TreeNode root) {
        //bfs+迭代
        boolean result = true;
        int standard = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
            standard=root.val;
        }
        LabelA:while (!queue.isEmpty()){
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode node = queue.poll();
                if(node.val!=standard){
                    result = false;
                    break LabelA;
                }
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
        return result;
    }
}