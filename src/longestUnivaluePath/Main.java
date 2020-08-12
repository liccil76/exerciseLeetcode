package longestUnivaluePath;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(2);
        b.left=d;
        b.right=e;
        c.left=f;

        int i = new Solution().longestUnivaluePath(a);
    }
}
