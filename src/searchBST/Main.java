package searchBST;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(4);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        b.left=d;
        b.right=e;

        TreeNode treeNode = new Solution().searchBST1(a, 2);
        System.out.println(treeNode);
    }
}
