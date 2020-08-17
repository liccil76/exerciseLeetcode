package checkStraightLine;

public class Main {
    public static void main(String[] args){
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        int[][] coordinates2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        int[][] coordinates3 = {{0,0},{0,1},{0,-1}};
        int[][] coordinates4 = {{1,1},{2,2},{2,0}};
        int[][] coordinates5 = {{0,1},{1,3},{-4,-7},{5,11}};
        boolean b = new Solution().checkStraightLine(coordinates5);
        System.out.println(b);
    }
}