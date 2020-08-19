package CheckPermutation;

public class Main {
    public static void main(String[] args){
        String a = "abc";
        String b = "acb";
        boolean b1 = new Solution().CheckPermutation(a, b);
        System.out.println(b1);
    }
}