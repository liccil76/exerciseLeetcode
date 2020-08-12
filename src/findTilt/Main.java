package findTilt;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left=b;
        a.right=c;

        int tilt = new Solution().findTilt(a);
        System.out.println(tilt);
    }
}
