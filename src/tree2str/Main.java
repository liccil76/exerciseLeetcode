package tree2str;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(4);
        b.left=d;

        String s = new Solution().tree2str(a);
        System.out.println(s);
    }
}