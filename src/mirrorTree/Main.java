package mirrorTree;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(4);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;

        TreeNode treeNode = new Solution().mirrorTree2(a);
//        System.out.println(treeNode);
    }
}
