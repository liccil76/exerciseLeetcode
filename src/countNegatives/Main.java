package countNegatives;

public class Main {
    public static void main(String[] args){
        int[][] grid = new int[2][2];
        grid[0] = new int[]{1,-1};
        grid[1] = new int[]{-1,-1};
        int i = new Solution().countNegatives(grid);
        System.out.println(i);
    }
}