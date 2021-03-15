package inorderTraversal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);

//        TreeNode b = new TreeNode(2);
//        TreeNode c = new TreeNode(2);
//        a.left=b;
//        a.right=c;

//        TreeNode d = new TreeNode(3);
//        c.left=d;

        List<Integer> list = new Solution().inorderTraversal(a);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
