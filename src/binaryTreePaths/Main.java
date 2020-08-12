package binaryTreePaths;

import java.util.List;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(5);
        b.right=d;

        List<String> strings = new Solution().binaryTreePaths(a);
        if(strings!=null){
            strings.forEach(s -> {
                System.out.println(s);
            });
        }
    }
}
