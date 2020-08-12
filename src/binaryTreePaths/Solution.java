package binaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
     * 说明: 叶子节点是指没有子节点的节点。
     *
     * 示例:
     * 输入:
     *    1
     *  /   \
     * 2     3
     *  \
     *   5
     * 输出: ["1->2->5", "1->3"]
     * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
     */
    private List<String> list =  new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        //dfs
        if(root!=null){
            temp(root,"");
        }
        return list;
    }
    public void temp(TreeNode node,String s){
        if(node==null){
            return;
        }
        s += Integer.toString(node.val);
        if(node.left==null && node.right==null){
            list.add(s);
        }else{
            s += "->";
            temp(node.left,s);
            temp(node.right,s);
        }
    }
}
