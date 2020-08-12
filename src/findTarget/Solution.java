package findTarget;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
     *
     * 案例 1:
     * 输入:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     * Target = 9
     * 输出: True
     *  
     * 案例 2:
     * 输入:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     * Target = 28
     * 输出: False
     */
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        temp(root,list);
        int l = 0, r = list.size() - 1;
        while (l<r){
            int temp = list.get(l) + list.get(r);
            if(temp==k) return true;
            if(temp>k) r--;
            if(temp<k) l++;
        }
        return false;
    }
    public void temp(TreeNode node,List<Integer> list){
        if(node!=null){
            temp(node.left,list);
            list.add(node.val);
            temp(node.right,list);
        }
    }
}