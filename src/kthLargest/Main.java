package kthLargest;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(3);

        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(4);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(2);
        b.right=d;

        int i = new Solution().kthLargest(a, 1);
        System.out.println(i);
    }
}