package sumOfLeftLeaves;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        b.left=d;
        b.right=e;

        System.out.println(new Solution().sumOfLeftLeaves(a));
    }
}
