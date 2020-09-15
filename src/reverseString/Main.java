package reverseString;

public class Main {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        new Solution().reverseString(s);
        for (char c : s) {
            System.out.print(c+" ");
        }
    }
}