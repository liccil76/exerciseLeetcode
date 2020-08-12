package preorder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Node> list3 = new ArrayList<>();
        list3.add(new Node(5,null));
        list3.add(new Node(6,null));

        List<Node> list2 = new ArrayList<>();
        list2.add(new Node(3,list3));
        list2.add(new Node(2,null));
        list2.add(new Node(4,null));

        Node node = new Node(1, list2);

        List<Integer> preorder = new Solution().preorder(node);
        for (Integer integer : preorder) {
            System.out.println(integer);
        }
    }
}
