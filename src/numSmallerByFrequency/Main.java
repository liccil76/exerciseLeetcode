package numSmallerByFrequency;

public class Main {
    public static void main(String[] args){
        String[] queries = {"bbb","cc"};
        String[] words = {"a","aa","aaa","aaaa"};
        int[] ints = new Solution().numSmallerByFrequency(queries, words);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}