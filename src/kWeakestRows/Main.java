package kWeakestRows;

public class Main {
    public static void main(String[] args){
        int[][] temp = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] ints = new Solution().kWeakestRows(temp, 3);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}