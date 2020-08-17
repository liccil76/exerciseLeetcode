package numEquivDominoPairs;

public class Main {
    public static void main(String[] args){
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        int i = new Solution().numEquivDominoPairs(dominoes);
        System.out.println(i);
    }
}