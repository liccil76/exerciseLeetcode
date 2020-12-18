package copyRandomList;

public class Main {
    public static void main(String[] args){
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        b.random=a;
        c.random=e;
        d.random=c;
        e.random=a;
        Node node = new Solution().copyRandomList(a);
    }
}