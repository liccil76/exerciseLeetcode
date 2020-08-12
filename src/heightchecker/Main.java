package heightchecker;

public class Main {
    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        int i = new Solution().heightChecker(heights);
        System.out.println(i);
    }
}
