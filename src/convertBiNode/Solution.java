package convertBiNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    /**
     * 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。
     * 实现一个方法，把二叉搜索树转换为单向链表，要求依然符合二叉搜索树的性质，转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。
     * 返回转换后的单向链表的头节点。
     * 注意：本题相对原题稍作改动
     *
     * 示例：
     * 输入： [4,2,5,1,3,null,6,0]
     * 输出： [0,null,1,null,2,null,3,null,4,null,5,null,6]
     *
     * 提示：
     * 节点数量不会超过 100000。
     */
    public TreeNode convertBiNode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //升序排序
        temp(root,list);
        if(list.size()>0){
            list.sort(Comparator.comparingInt(o -> o));
            TreeNode node = new TreeNode(list.get(0));
            TreeNode temp = node;
            for (int i = 1; i < list.size(); i++) {
                temp.right=new TreeNode(list.get(i));
                temp=temp.right;
            }
            return node;
        }else {
            return null;
        }
    }
    public void temp(TreeNode node,List<Integer> list){
        if(node!=null){
            temp(node.left,list);
            list.add(node.val);
            temp(node.right,list);
        }
    }

    public TreeNode convertBiNode2(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode subRoot = convertBiNode2(root.left);
        if (subRoot == null) {
            subRoot = root;
        } else {
            TreeNode subRootTmp = subRoot;
            while (subRoot.right != null) {
                subRoot = subRoot.right;
            }
            subRoot.right = root;
            subRoot = subRootTmp;
        }
        root.left = null;
        root.right = convertBiNode2(root.right);
        return subRoot;
    }
}
