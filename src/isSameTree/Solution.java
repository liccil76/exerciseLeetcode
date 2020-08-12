package isSameTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     *
     * 示例 1:
     * 输入:       1         1
     *           / \       / \
     *          2   3     2   3
     *         [1,2,3],   [1,2,3]
     * 输出: true
     *
     * 示例 2:
     * 输入:      1          1
     *           /           \
     *          2             2
     *         [1,2],     [1,null,2]
     * 输出: false
     *
     * 示例 3:
     * 输入:       1         1
     *           / \       / \
     *          2   1     1   2
     *         [1,2,1],   [1,1,2]
     * 输出: false
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //使用迭代、bfs、队列
        Queue<TreeNode> one = new LinkedList<>();
        Queue<TreeNode> two = new LinkedList<>();
        if(p==null && q==null){
            return true;
        }
        if((p==null && q!=null) || (p!=null && q==null)){
            return false;
        }
        one.add(p);
        two.add(q);
        boolean result = true;
        while(true){
            TreeNode P = one.poll();
            TreeNode Q = two.poll();
            if(P==null && Q==null){
                break;
            }
            if((P==null && Q!=null) || (P!=null && Q==null)){
                result = false;
                break;
            }
            if(P!=null && Q!=null){
                if(P.val != Q.val){
                    result = false;
                    break;
                }
                if(P.left!=null){
                    if(Q.left==null){
                        result = false;
                        break;
                    }
                    one.add(P.left);
                }
                if(P.right!=null){
                    if(Q.right==null){
                        result = false;
                        break;
                    }
                    one.add(P.right);
                }
                if(Q.left!=null){
                    if(P.left==null){
                        result = false;
                        break;
                    }
                    two.add(Q.left);
                }
                if(Q.right!=null){
                    if(P.right==null){
                        result = false;
                        break;
                    }
                    two.add(Q.right);
                }
            }
        }
        return result;
    }
}