package maxDepth;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    /**
     * 给定一个 N 叉树，找到其最大深度。
     * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
     *
     * 例如，给定一个 3叉树 :
     * 我们应返回其最大深度，3。
     *
     * 说明:
     * 树的深度不会超过 1000。
     * 树的节点总不会超过 5000。
     */
    public int maxDepth(Node root) {
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            depth++;
            for (int i = queue.size() - 1; i >= 0; i--) {
                Node poll = queue.poll();
                if(poll.children!=null&&poll.children.size()>0){
                    for (Node child : poll.children) {
                        queue.add(child);
                    }
                }
            }
        }
        return depth;
    }
}
