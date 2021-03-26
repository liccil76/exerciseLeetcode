package deleteDuplicates;

public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        a.next=b;
        b.next=c;

        ListNode listNode = new Solution().deleteDuplicates(a);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}
