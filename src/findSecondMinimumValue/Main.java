package findSecondMinimumValue;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(2);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(7);
        c.left=d;
        c.right=e;

        int secondMinimumValue = new Solution().findSecondMinimumValue(a);
        System.out.println(secondMinimumValue);
    }
}
