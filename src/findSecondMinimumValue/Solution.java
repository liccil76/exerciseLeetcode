package findSecondMinimumValue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。
     * 如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
     * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
     *
     * 示例 1:
     * 输入:
     *     2
     *    / \
     *   2   5
     *      / \
     *     5   7
     * 输出: 5
     * 说明: 最小的值是 2 ，第二小的值是 5 。
     *
     * 示例 2:
     * 输入:
     *     2
     *    / \
     *   2   2
     * 输出: -1
     * 说明: 最小的值是 2, 但是不存在第二小的值。
     */
    public int findSecondMinimumValue(TreeNode root) {
        //bfs+队列+迭代
        int result = -1;
        boolean firstLayer = true;
        if(root != null){
            int min = root.val;
            result = root.val;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                for (int i = queue.size() - 1; i >= 0; i--) {
                    TreeNode node = queue.poll();
                    if(node.left != null || node.right != null){
                        //有两个子节点
                        int leftVal = node.left.val;
                        int rightVal = node.right.val;
                        if(firstLayer){
                            if(leftVal > result){
                                result = leftVal;
                            }
                            if(rightVal > result){
                                result = rightVal;
                            }
                        }else{
                            if(leftVal>min && leftVal<result){
                                result = leftVal;
                            }
                            if(rightVal>min && rightVal<result){
                                result = rightVal;
                            }
                        }
                        queue.add(node.left);
                        queue.add(node.right);
                    }
                }
                firstLayer=false;
            }
            if(result == root.val){
                result = -1;
            }
        }
        return result;
    }
}