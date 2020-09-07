package shiftGrid;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[][] grid = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int k = 4;
        List<List<Integer>> lists = new Solution().shiftGrid(grid, k);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}