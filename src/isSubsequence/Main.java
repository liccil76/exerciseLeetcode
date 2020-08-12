package isSubsequence;

public class Main {
    public static void main(String[] args){
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean subsequence = new Solution().isSubsequence(s, t);
        System.out.println(subsequence);
    }
}
