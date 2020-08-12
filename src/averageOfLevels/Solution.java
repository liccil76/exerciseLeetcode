package averageOfLevels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    /**
     * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
     *
     * 示例 1：
     * 输入：
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 输出：[3, 14.5, 11]
     * 解释：
     * 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
     *  
     * 提示：
     * 节点值的范围在32位有符号整数范围内。
     */
    public List<Double> averageOfLevels(TreeNode root) {
        //bfs
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
            while (!queue.isEmpty()){
                int counter = 0;
                double sum = 0;
                for (int i = queue.size() - 1; i >= 0; i--) {
                    TreeNode poll = queue.poll();
                    counter++;
                    sum += poll.val;
                    if (poll.left!=null) queue.add(poll.left);
                    if (poll.right!=null) queue.add(poll.right);
                }
                double temp = sum*1.0/counter;
                list.add(temp);
            }
        }
        return list;
    }
}