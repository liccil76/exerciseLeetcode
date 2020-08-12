package isSubtree;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(3);

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(2);
        b.left=d;
        b.right=e;

        TreeNode f = new TreeNode(0);
        e.left=f;

        TreeNode t1 = new TreeNode(4,new TreeNode(1),new TreeNode(2));

        boolean subtree = new Solution().isSubtree(a, t1);
        System.out.println(subtree);
    }
}
