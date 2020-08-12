package postorder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 给定一个 N 叉树，返回其节点值的后序遍历。
     *
     * 例如，给定一个 3叉树 :
     * 返回其后序遍历: [5,6,3,2,4,1].
     *
     * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
     */
    private List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        temp(root);
        List<Integer> temp = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.get(i));
        }
        return temp;
    }
    public void temp(Node node){
        if(node!=null){
            list.add(node.val);
            if(node.children!=null){
                List<Node> children = node.children;
                for (int i = children.size() - 1; i >= 0; i--) {
                    temp(children.get(i));
                }
            }
        }
    }
}
