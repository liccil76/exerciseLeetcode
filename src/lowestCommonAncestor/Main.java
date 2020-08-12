package lowestCommonAncestor;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(3);

        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(1);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(0);
        TreeNode g = new TreeNode(8);
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;

        TreeNode h = new TreeNode(7);
        TreeNode i = new TreeNode(4);
        e.left=h;
        e.right=i;

        TreeNode treeNode = new Solution().lowestCommonAncestor2(a, new TreeNode(5), new TreeNode(0));
        System.out.println(treeNode.val);
    }
}
