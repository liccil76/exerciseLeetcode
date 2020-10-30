package reversePrint;

public class Solution {
    /**
     * 剑指 Offer 06. 从尾到头打印链表
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * 示例 1：
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     *
     * 限制：
     * 0 <= 链表长度 <= 10000
     */
    public int[] reversePrint(ListNode head) {
        int count = 0;
        int[] temp = new int[10000];
        while (true){
            if(head!=null){
                temp[count] = head.val;
                count++;
                head=head.next;
            }else{
                break;
            }
        }
        int[] arr = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp[count-i-1];
        }
        return arr;
    }
}