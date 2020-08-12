package findTarget;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(2);

        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(3);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(-4);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(7);
        b.left=d;
        b.right=e;
//        c.right=f;

        boolean target = new Solution().findTarget(a, -1);
        System.out.println(target);
    }
}
