package isCousins;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(4);
        b.left=d;

        boolean cousins = new Solution().isCousins(a, 4, 3);
        System.out.println(cousins);
    }
}