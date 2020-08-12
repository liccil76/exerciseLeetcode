package increasingBST;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(5);

        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(6);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(8);
        b.left=d;
        b.right=e;
        c.right=f;

        TreeNode g = new TreeNode(1);
        TreeNode h = new TreeNode(7);
        TreeNode i = new TreeNode(9);
        d.left=g;
        f.left=h;
        f.right=i;

        TreeNode treeNode = new Solution().increasingBST(a);
        System.out.println(treeNode);
    }
}
