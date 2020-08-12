package findMode;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        a.right=b;

        TreeNode c = new TreeNode(2);
        b.left=c;

        int[] mode = new Solution().findMode(a);
//        for (int i = 0; i < mode.length; i++) {
//            System.out.println(mode[i]);
//        }
    }
}
