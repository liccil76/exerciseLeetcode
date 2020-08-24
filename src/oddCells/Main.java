package oddCells;

public class Main {
    public static void main(String[] args){
        int n = 48, m = 37;
        int[][] indices = {{40,5}};
        int i = new Solution().oddCells2(n, m, indices);
        System.out.println(i);
    }
}