package mergeTwoLists;

public class Main {
    public static void main(String[] args){
        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(4);
//        ListNode c = new ListNode(6);
//        a.next=b;
//        b.next=c;

        ListNode d = new ListNode(1);
//        ListNode e = new ListNode(7);
//        ListNode f = new ListNode(8);
//        d.next=e;
//        e.next=f;

        ListNode listNode = new Solution().mergeTwoLists(a, d);
    }
}