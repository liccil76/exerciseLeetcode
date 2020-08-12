package leafSimilar;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
     *
     * 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。
     * 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
     * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
     *
     * 提示：
     * 给定的两颗树可能会有 1 到 200 个结点。
     * 给定的两颗树上的值介于 0 到 200 之间。
     */
    private List<Integer> list = new ArrayList<>();
    private int count = 0;
    private boolean result = true;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        temp(root1);
        temp2(root2);
        if(count!=list.size()){
            result = false;
        }
        return result;
    }
    public void temp(TreeNode node){
        if(node!=null){
            if(node.left==null&&node.right==null){
                list.add(node.val);
            }
            temp(node.left);
            temp(node.right);
        }
    }
    public void temp2(TreeNode node){
        if(node!=null){
            if(result){
                if(node.left==null&&node.right==null){
                    if(count>list.size()-1 || node.val!=list.get(count)){
                        result=false;
                        return;
                    }
                    count++;
                }
                temp2(node.left);
                temp2(node.right);
            }
        }
    }
}