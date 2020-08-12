package convertBST;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(5);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(13);
        a.left=b;
        a.right=c;

        TreeNode treeNode = new Solution().convertBST(a);
        System.out.println(treeNode);
    }
}
