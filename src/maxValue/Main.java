package maxValue;

public class Main {
    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int i = new Solution().maxValue(grid);
        System.out.println(i);
    }
}