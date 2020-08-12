package maxDepth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        TreeNode a = new TreeNode(3);
//
//        TreeNode b = new TreeNode(9);
//        TreeNode c = new TreeNode(20);
//        a.left=b;
//        a.right=c;
//
//        TreeNode d = new TreeNode(15);
//        TreeNode e = new TreeNode(7);
//        c.left=d;
//        c.right=e;
//
//        System.out.println(new Solution().maxDepth(a));

        List<Node> three = new ArrayList<>();
        three.add(new Node(5,null));
        three.add(new Node(6,null));

        List<Node> two = new ArrayList<>();
        two.add(new Node(3,three));
        two.add(new Node(2,null));
        two.add(new Node(4,null));

        Node node = new Node(1, two);
        int i = new Solution2().maxDepth(node);
        System.out.println(i);
    }
}
