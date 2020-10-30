package CQueue;

public class Main {
    public static void main(String[] args){
        CQueue obj = new CQueue();
        System.out.println(obj.deleteHead());
        obj.appendTail(97);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        obj.appendTail(15);
        System.out.println(obj.deleteHead());
        obj.appendTail(1);
        obj.appendTail(43);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        obj.appendTail(18);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        obj.appendTail(36);
        obj.appendTail(69);
        obj.appendTail(21);
        obj.appendTail(91);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        obj.appendTail(22);
        obj.appendTail(40);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        obj.appendTail(81);
        obj.appendTail(65);
    }
}