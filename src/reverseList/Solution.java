package reverseList;

import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Solution {
    /**
     * 剑指 Offer 24. 反转链表
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     *
     * 示例:
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *
     * 限制：
     * 0 <= 节点个数 <= 5000
     */
    /**
     * 双指针
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    /**
     * 栈（使用压栈方式）
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            ListNode temp = head.next;
            head.next = null;
            stack.add(head);
            head = temp;
        }
        ListNode trueHead = stack.pop();
        ListNode cur = trueHead;
        while (!stack.isEmpty()){
            ListNode temp = stack.pop();
            cur.next = temp;
            cur = temp;
        }
        return trueHead;
    }
}