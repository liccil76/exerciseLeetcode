package pathSum;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lichen
 * @since 2021/4/30 16:35
 */
public class Solution2 {
    /**
     * 剑指 Offer 34. 二叉树中和为某一值的路径
     * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
     * 从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
     * <p>
     * 示例:
     * 给定如下二叉树，以及目标和 target = 22，
     * <p>
     * 5
     * / \
     * 4   8
     * /   / \
     * 11  13  4
     * /  \    / \
     * 7    2  5   1
     * 返回:
     * <p>
     * [
     * [5,4,11,2],
     * [5,8,4,5]
     * ]
     * <p>
     * 提示：
     * 节点总数 <= 10000
     */
    //父亲进入儿子的时候，把已有的路径传进去，注意值传递和引用传递
    //递归实现
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    void recur(TreeNode root, int tar) {
        if (root == null) return;
        path.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null) res.add(new LinkedList(path));
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(8);
        a.left = b;
        a.right = c;

        TreeNode d = new TreeNode(11);
        TreeNode e = new TreeNode(13);
        TreeNode f = new TreeNode(4);
        b.left = d;
        c.left = e;
        c.right = f;

        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(2);
        TreeNode i = new TreeNode(5);
        TreeNode j = new TreeNode(1);
        d.left = g;
        d.right = h;
        f.left = i;
        f.right = j;

        List<List<Integer>> lists = new Solution2().pathSum(a, 22);
    }
}