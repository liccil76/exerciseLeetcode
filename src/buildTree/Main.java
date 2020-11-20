package buildTree;

public class Main {
    public static void main(String[] args){
        int[] preorder = {1,2};
        int[] inorder = {1,2};
        TreeNode treeNode = new Solution().buildTree(preorder, inorder);
        System.out.println(treeNode);
    }
}