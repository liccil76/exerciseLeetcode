package treeToDoublyList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lichen
 * @since 2021/4/2 16:03
 */
public class Solution {
    /**
     * 剑指 Offer 36. 二叉搜索树与双向链表
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。
     * 要求不能创建任何新的节点，只能调整树中节点指针的指向。
     * <p>
     * 为了让您更好地理解问题，以下面的二叉搜索树为例：
     * <p>
     * 我们希望将这个二叉搜索树转化为双向循环链表。
     * 链表中的每个节点都有一个前驱和后继指针。
     * 对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。
     * 下图展示了上面的二叉搜索树转化成的链表。“head” 表示指向链表中有最小元素的节点。
     * <p>
     * <p>
     * 特别地，我们希望可以就地完成转换操作。
     * 当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。
     * 还需要返回链表中的第一个节点的指针。
     * <p>
     * 注意：本题与主站 426 题相同：https://leetcode-cn.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/
     * <p>
     * 注意：此题对比原题有改动。
     */
    //迭代解法
    public Node treeToDoublyList(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null) return null;
        List<Node> list = new ArrayList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.left == null && node.right == null) list.add(node);
            if (node.right != null) stack.add(node.right);
            Node left = node.left;
            if (node.left != null || node.right != null) {
                node.left = null;
                node.right = null;
                stack.add(node);
            }
            if (left != null) stack.add(left);
        }
        Node head = list.get(0);
        Node tail = list.get(list.size() - 1);
        for (int i = 1; i < list.size(); i++) {
            Node node = list.get(i);
            Node pre = list.get(i - 1);
            pre.right = node;
            node.left = pre;
        }
        tail.right = head;
        head.left = tail;
        return head;
    }
}
