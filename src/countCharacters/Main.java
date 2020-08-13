package countCharacters;

public class Main {
    public static void main(String[] args){
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int i = new Solution().countCharacters(words, chars);
        System.out.println(i);
    }
}