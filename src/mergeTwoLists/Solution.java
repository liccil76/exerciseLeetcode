package mergeTwoLists;

public class Solution {
    /**
     * 剑指 Offer 25. 合并两个排序的链表
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     *
     * 示例1：
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * 限制：
     * 0 <= 链表长度 <= 1000
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode temp = null;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                ListNode listNode = new ListNode(l2.val);
                if (result == null) {
                    result = listNode;
                } else {
                    result.next = listNode;
                    result = result.next;
                }
                if (temp == null) temp = result;
                l2 = l2.next;
            }
            if (l1 != null && l2 == null) {
                ListNode listNode = new ListNode(l1.val);
                if (result == null) {
                    result = listNode;
                } else {
                    result.next = listNode;
                    result = result.next;
                }
                if (temp == null) temp = result;
                l1 = l1.next;
            }
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    ListNode listNode = new ListNode(l1.val);
                    if (result == null) {
                        result = listNode;
                    } else {
                        result.next = listNode;
                        result = result.next;
                    }
                    if (temp == null) temp = result;
                    l1 = l1.next;
                } else {
                    ListNode listNode = new ListNode(l2.val);
                    if (result == null) {
                        result = listNode;
                    } else {
                        result.next = listNode;
                        result = result.next;
                    }
                    if (temp == null) temp = result;
                    l2 = l2.next;
                }
            }
        }
        return temp;
    }

    //精简版
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

}