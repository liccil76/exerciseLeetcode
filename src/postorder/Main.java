package postorder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Node> three = new ArrayList<>();
        three.add(new Node(5,null));
        three.add(new Node(6,null));
        Node a = new Node(3,three);
        Node b = new Node(2,null);
        Node c = new Node(4,null);
        List<Node> two = new ArrayList<>();
        two.add(a);
        two.add(b);
        two.add(c);
        Node root = new Node(1,two);
        List<Integer> postorder = new Solution().postorder(root);
        for (Integer integer : postorder) {
            System.out.println(integer);
        }
    }
}
