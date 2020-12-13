package reverseList;

public class Solution2 {
    /**
     * 阿里云面试题
     * 初始化一个链表数据，并对该链表实现两两翻转（是翻转整个节点，而不是仅交换节点的值），然后输出翻转之后的结果。
     * 比如构造的链表是：1->2->3->4->5，翻转之后，输出：2->1->4->3->5.
     */
    //使用递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode result = head.next;

        ListNode temp = head;
        ListNode two = head.next;
        ListNode next = two.next;
        head = two;
        head.next = temp;

        head.next.next = reverse(next);
        return result;
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode temp = node;
        ListNode two = node.next;
        ListNode next = two.next;
        node = two;
        node.next = temp;
        node.next.next = reverse(next);
        return node;
    }

}