package validateStackSequences;

public class Main {
    public static void main(String[] args){
        int[] pushed={1,2,3,4,5};
        int[] popped={4,3,5,1,2};
        boolean b = new Solution().validateStackSequences(pushed, popped);
        System.out.println(b);
    }
}