package getMinimumDifference;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(236);

        TreeNode b = new TreeNode(104);
        TreeNode c = new TreeNode(701);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(227);
        TreeNode e = new TreeNode(911);
        b.right=d;
        c.right=e;

        int minimumDifference = new Solution().getMinimumDifference(a);
        System.out.println(minimumDifference);
    }
}
