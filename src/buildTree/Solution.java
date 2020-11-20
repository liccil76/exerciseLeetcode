package buildTree;

public class Solution {
    /**
     * 剑指 Offer 07. 重建二叉树
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * 例如，给出
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     * 返回如下的二叉树：
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *
     * 限制：
     * 0 <= 节点个数 <= 5000
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0) return null;
        int rootValue = preorder[0];
        TreeNode root = new TreeNode(rootValue);
        //左子树的size
        int leftLength = 0;
        for (int i : inorder) {
            if(i==rootValue) break;
            leftLength++;
        }
        //右子树的size
        int rightLength = inorder.length-leftLength-1;
        root.left = leftLength==0 ? null : temp(preorder,1,leftLength,inorder,0,leftLength);
        root.right = rightLength==0 ? null : temp(preorder,1+leftLength,rightLength,inorder,leftLength+1,rightLength);
        return root;
    }
    public TreeNode temp(int[] preorder,int preStart,int preLength, int[] inorder,int inStart,int inLength) {
        int rootValue = preorder[preStart];
        TreeNode node = new TreeNode(rootValue);
        //左子树的size
        int leftLength = 0;
        for (int i = inStart; i <= inStart+preLength; i++) {
            if(inorder[i]==rootValue) break;
            leftLength++;
        }
        //右子树的size
        int rightLength = inLength-leftLength-1;
        node.left = leftLength==0 ? null : temp(preorder,preStart+1,leftLength,inorder,inStart,leftLength);
        node.right = rightLength==0 ? null : temp(preorder,preStart+leftLength+1,rightLength,inorder,inStart+leftLength+1,rightLength);
        return node;
    }
}
