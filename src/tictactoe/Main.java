package tictactoe;

public class Main {
    public static void main(String[] args){
//        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
//        int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
//        int[][] moves = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        int[][] moves = {{0,0},{1,1}};
        String tictactoe = new Solution().tictactoe(moves);
        System.out.println(tictactoe);
    }
}