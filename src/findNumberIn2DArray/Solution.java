package findNumberIn2DArray;

public class Solution {
    /**
     * 剑指 Offer 04. 二维数组中的查找
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
     *
     * 示例:
     * 现有矩阵 matrix 如下：
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     * 给定 target = 5，返回 true。
     * 给定 target = 20，返回 false。 
     *
     * 限制：
     * 0 <= n <= 1000
     * 0 <= m <= 1000
     */
    //将矩阵的右上角看做是binary search tree的根
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int x = 0;
        int y = matrix[0].length-1;
        while (x<=matrix.length-1 && y>=0){
            int value = matrix[x][y];
            if(value==target) return true;
            if(value>target) y--;
            if(value<target) x++;
        }
        return false;
    }
}