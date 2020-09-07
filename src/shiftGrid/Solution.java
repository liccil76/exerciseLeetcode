package shiftGrid;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 1260. 二维网格迁移
     * 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
     * 每次「迁移」操作将会引发下述活动：
     * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
     * 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
     * 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
     * 请你返回 k 次迁移操作后最终得到的 二维网格。
     *
     * 示例 1：
     * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
     * 输出：[[9,1,2],[3,4,5],[6,7,8]]
     *
     * 示例 2：
     * 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
     * 输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
     *
     * 示例 3：
     * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
     * 输出：[[1,2,3],[4,5,6],[7,8,9]]
     *
     * 提示：
     * 1 <= grid.length <= 50
     * 1 <= grid[i].length <= 50
     * -1000 <= grid[i][j] <= 1000
     * 0 <= k <= 100
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (int i = 0; i < k; i++) {
            for (int i1 = 0; i1 < grid.length; i1++) {
                int temp = grid[i1][grid[0].length-1];
                for (int i2 = grid[0].length - 1; i2 >= 1; i2--) grid[i1][i2] = grid[i1][i2-1];
                grid[i1][0]=temp;
            }
            int temp2 = grid[grid.length-1][0];
            for (int j = grid.length-1; j >=1; j--) grid[j][0] = grid[j-1][0];
            grid[0][0]=temp2;
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : grid) {
            List<Integer> list = new ArrayList<>();
            lists.add(list);
            for (int anInt : ints) list.add(anInt);
        }
        return lists;
    }
}