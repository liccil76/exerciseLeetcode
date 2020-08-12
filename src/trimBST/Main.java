package trimBST;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(3);

        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(4);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(2);
        b.right=d;

        TreeNode e = new TreeNode(1);
        d.left=e;

        TreeNode treeNode = new Solution().trimBST(a, 1, 2);
        System.out.println(treeNode);
    }
}