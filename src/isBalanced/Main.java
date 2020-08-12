package isBalanced;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(15);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(9);
        TreeNode d = new TreeNode(20);
        TreeNode e = new TreeNode(3);
        e.left=c;
        e.right=d;
        c.left=a;
        c.right=b;
        System.out.println(new Solution().isBalanced(e));
    }
}
