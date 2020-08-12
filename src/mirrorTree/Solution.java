package mirrorTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     *
     * 例如输入：
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     * 镜像输出：
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     *
     * 示例 1：
     * 输入：root = [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     *  
     *
     * 限制：
     * 0 <= 节点个数 <= 1000
     *
     * 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/
     */
    //dfs
    public TreeNode mirrorTree(TreeNode root) {
        temp(root);
        return root;
    }
    public void temp(TreeNode node){
        if(node!=null){
            TreeNode tempNode = node.left;
            node.left=node.right;
            node.right=tempNode;
            temp(node.left);
            temp(node.right);
        }
    }

    //迭代
    public TreeNode mirrorTree2(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<>();
        if(root!=null){
            list.add(root);
            while (!list.isEmpty()){
                for (int i = list.size() - 1; i >= 0; i--) {
                    TreeNode poll = list.poll();
                    TreeNode temp = poll.left;
                    poll.left=poll.right;
                    poll.right=temp;
                    if(poll.left!=null) list.add(poll.left);
                    if(poll.right!=null) list.add(poll.right);
                }
            }
        }
        return root;
    }
}