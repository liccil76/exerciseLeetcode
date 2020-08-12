package levelOrderBottom;

import java.util.List;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(3);

        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        c.left=d;
        c.right=e;

        List<List<Integer>> lists = new Solution().levelOrderBottom(a);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+",");
            }
            System.out.println("----------");
        }
    }
}
