package verifyPostorder;

public class Main {
    public static void main(String[] args){
        int[] postorder = {1,2,5,10,6,9,4,3};
        boolean b = new Solution().verifyPostorder(postorder);
        System.out.println(b);
    }
}