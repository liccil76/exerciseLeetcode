package treeToDoublyList;

/**
 * @author lichen
 * @since 2021/4/2 16:03
 */
public class Main {
    public static void main(String[] args) {
        Node a = new Node(4);

        Node b = new Node(2);
        Node c = new Node(5);
        a.left=b;
        a.right=c;

        Node d = new Node(1);
        Node e = new Node(3);
        b.left=d;
        b.right=e;

        Node node = new Solution().treeToDoublyList(a);
    }
}
