package isSymmetric;

public class Main {
    public static void main(String[] args){
//        TreeNode a = new TreeNode(1);
//
//        TreeNode b = new TreeNode(2);
//        TreeNode c = new TreeNode(2);
//        a.left=b;
//        a.right=c;
//
//        TreeNode d = new TreeNode(3);
//        TreeNode e = new TreeNode(4);
//        TreeNode f = new TreeNode(4);
//        TreeNode g = new TreeNode(3);
//        b.left=d;
//        b.right=e;
//        c.left=f;
//        c.right=g;
//
//        System.out.println(new Solution().isSymmetric(a));

        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(3);
        b.right=d;
        c.right=e;

        System.out.println(new Solution().isSymmetric(a));
    }
}
