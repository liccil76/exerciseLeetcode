package preorder;

import java.util.*;

public class Solution {
    /**
     * 给定一个 N 叉树，返回其节点值的前序遍历。
     *
     * 例如，给定一个 3叉树 :
     * 返回其前序遍历: [1,3,5,6,2,4]。
     *
     * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
     */
    //迭代
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if(root==null){
            return list;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            Node pop = stack.pollLast();
            list.add(pop.val);
            if(pop.children!=null && pop.children.size()>0){
                List<Node> children = pop.children;
                for (int i1 = children.size() - 1; i1 >= 0; i1--) {
                    stack.add(children.get(i1));
                }
            }
        }
        return list;
    }

    //递归
    private List<Integer> list = new ArrayList<>();
    public List<Integer> preorder2(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        temp(root);
        return list;
    }
    public void temp(Node node){
        if(node!=null){
            list.add(node.val);
            if(node.children!=null && node.children.size()>0){
                for (Node child : node.children) {
                    temp(child);
                }
            }
        }
    }
}
