package reverseList;

public class Main {
    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ListNode listNode = new Solution().reverseList2(a);
        System.out.println(listNode);
    }
}