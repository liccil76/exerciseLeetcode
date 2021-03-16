package preorderTraversal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        a.right=b;

        TreeNode c = new TreeNode(3);
        b.left=c;

        List<Integer> list = new Solution().preorderTraversal(a);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
