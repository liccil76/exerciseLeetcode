package deleteNode;

public class Solution {
    /**
     * 面试题 02.03. 删除中间节点
     * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
     *
     * 示例：
     * 输入：单向链表a->b->c->d->e->f中的节点c
     * 结果：不返回任何数据，但该链表变为a->b->d->e->f
     */
    public void deleteNode(ListNode node) {
        //将这个结点的数据替换为下一个结点
        node.val = node.next.val;
        //删除下一个结点
        node.next = node.next.next;
    }
}
