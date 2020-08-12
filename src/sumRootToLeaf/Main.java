package sumRootToLeaf;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(1);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(0);
        TreeNode g = new TreeNode(1);
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;

        int i = new Solution().sumRootToLeaf(a);
        System.out.println(i);
    }
}
