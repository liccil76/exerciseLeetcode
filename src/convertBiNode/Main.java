package convertBiNode;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(4);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        b.left=d;
        b.right=e;
        c.right=f;

        TreeNode g = new TreeNode(0);
        f.left=g;

        TreeNode treeNode = new Solution().convertBiNode(a);
        System.out.println(treeNode);
    }
}
