package isSubStructure;

public class Main {
    public static void main(String[] args){
        TreeNode a1 = new TreeNode(3);

        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(5);

        a1.left=a2;
        a1.right=a3;

        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(2);
        a2.left=a4;
        a2.right=a5;

        TreeNode b1 = new TreeNode(4);

        TreeNode b2 = new TreeNode(1);
        b1.left=b2;

        boolean subStructure = new Solution().isSubStructure(a1, b1);
    }
}