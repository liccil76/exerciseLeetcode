package copyRandomList;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 剑指 Offer 35. 复杂链表的复制
     * 请实现 copyRandomList 函数，复制一个复杂链表。
     * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
     * <p>
     * 示例 1：
     * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
     * <p>
     * 示例 2：
     * 输入：head = [[1,1],[2,1]]
     * 输出：[[1,1],[2,1]]
     * <p>
     * 示例 3：
     * 输入：head = [[3,null],[3,0],[3,null]]
     * 输出：[[3,null],[3,0],[3,null]]
     * <p>
     * 示例 4：
     * 输入：head = []
     * 输出：[]
     * 解释：给定的链表为空（空指针），因此返回 null。
     * <p>
     * 提示：
     * -10000 <= Node.val <= 10000
     * Node.random 为空（null）或指向链表中的节点。
     * 节点数目不超过 1000 。
     */
    //使用hash表
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node,Node> nodeMap = new HashMap<>();
        Node result = new Node(head.val);
        Node temp = result;
        nodeMap.put(head,temp);
        head = head.next;
        while (head != null) {
            temp.next = new Node(head.val);
            temp=temp.next;
            nodeMap.put(head,temp);
            head=head.next;
        }
        for (Map.Entry<Node, Node> nodeEntry : nodeMap.entrySet()) {
            //获取old
            Node oldNode = nodeEntry.getKey();
            if(oldNode.random != null){
                //获取new
                Node newNode = nodeEntry.getValue();
                //获取old的random
                Node oldRandom = oldNode.random;
                //根据old的Random获取newNode的random
                Node newRandom = nodeMap.get(oldRandom);
                //设置newNode的random
                newNode.random=newRandom;
            }
        }
        return result;
    }

    //大佬解法，使用hash表
    public Node copyRandomList2(Node head) {
        if(head == null) return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
        while(cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 4. 构建新链表的 next 和 random 指向
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 5. 返回新链表的头节点
        return map.get(head);
    }

}