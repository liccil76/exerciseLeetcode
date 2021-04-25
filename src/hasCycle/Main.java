package hasCycle;

/**
 * @author lichen
 * @since 2021/4/17 16:04
 */
public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;

        boolean b1 = new Solution().hasCycle(a);
        System.out.println(b1);
    }
}
