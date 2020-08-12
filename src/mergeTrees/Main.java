package mergeTrees;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(2);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(5);
        b.left=d;

        TreeNode a1 = new TreeNode(2);

        TreeNode b1 = new TreeNode(1);
        TreeNode c1 = new TreeNode(3);
        a1.left=b1;
        a1.right=c1;

        TreeNode d1 = new TreeNode(4);
        TreeNode e1 = new TreeNode(7);
        b1.right=d1;
        c1.right=e1;

        TreeNode treeNode = new Solution().mergeTrees(a, a1);
        System.out.println(treeNode);
    }
}