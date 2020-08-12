package searchBST;

public class Solution {
    /**
     * 给定二叉搜索树（BST）的根节点和一个值。
     * 你需要在BST中找到节点值等于给定值的节点。
     * 返回以该节点为根的子树。
     * 如果节点不存在，则返回 NULL。
     *
     * 例如，
     * 给定二叉搜索树:
     *         4
     *        / \
     *       2   7
     *      / \
     *     1   3
     * 和值: 2
     * 你应该返回如下子树:
     *       2
     *      / \
     *     1   3
     * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
     */
    //使用递归
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = null;
        if(root==null){
            return node;
        }
        int value = root.val;
        if(value > val){
            node = searchBST(root.left,val);
        }else if(value < val){
            node = searchBST(root.right,val);
        }else{
            //value == val
            node = root;
        }
        return node;
    }
    //使用迭代
    public TreeNode searchBST1(TreeNode root, int val) {
        TreeNode node = null;
        while (root != null){
            int value = root.val;
            if(value > val){
                root = root.left;
            }else if(value < val){
                root = root.right;
            }else{
                node = root;
                break;
            }
        }
        return node;
    }
}