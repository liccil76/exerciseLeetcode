package reversePrint;

public class Main {
    public static void main(String[] args){
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(1);
        c.next=b;
        b.next=a;
        int[] ints = new Solution().reversePrint(c);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}