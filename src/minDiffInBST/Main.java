package minDiffInBST;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(4);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(6);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        b.left=d;
        b.right=e;

        int i = new Solution().minDiffInBST(a);
        System.out.println(i);
    }
}
