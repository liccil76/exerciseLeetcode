package rangeSumBST;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(10);

        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(18);
        b.left=d;
        b.right=e;
        c.right=f;

        int i = new Solution().rangeSumBST(a, 7, 15);
        System.out.println(i);
    }
}
