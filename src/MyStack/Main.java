package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(5);
        int param_2 = obj.pop();
        System.out.println(param_2);
        int param_3 = obj.top();
        System.out.println(param_3);
        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
}
