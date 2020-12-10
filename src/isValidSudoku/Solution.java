package isValidSudoku;

import java.util.HashSet;

public class Solution {
    /**
     * 有效的数独
     * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
     *
     * 数字 1-9 在每一行只能出现一次。
     * 数字 1-9 在每一列只能出现一次。
     * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
     *
     * 上图是一个部分填充的有效的数独。
     * 数独部分空格内已填入了数字，空白格用 '.' 表示。
     *
     * 示例 1:
     * 输入:
     * [
     *   ["5","3",".",".","7",".",".",".","."],
     *   ["6",".",".","1","9","5",".",".","."],
     *   [".","9","8",".",".",".",".","6","."],
     *   ["8",".",".",".","6",".",".",".","3"],
     *   ["4",".",".","8",".","3",".",".","1"],
     *   ["7",".",".",".","2",".",".",".","6"],
     *   [".","6",".",".",".",".","2","8","."],
     *   [".",".",".","4","1","9",".",".","5"],
     *   [".",".",".",".","8",".",".","7","9"]
     * ]
     * 输出: true
     *
     * 示例 2:
     * 输入:
     * [
     *   ["8","3",".",".","7",".",".",".","."],
     *   ["6",".",".","1","9","5",".",".","."],
     *   [".","9","8",".",".",".",".","6","."],
     *   ["8",".",".",".","6",".",".",".","3"],
     *   ["4",".",".","8",".","3",".",".","1"],
     *   ["7",".",".",".","2",".",".",".","6"],
     *   [".","6",".",".",".",".","2","8","."],
     *   [".",".",".","4","1","9",".",".","5"],
     *   [".",".",".",".","8",".",".","7","9"]
     * ]
     * 输出: false
     * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
     *      但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
     *
     * 说明:
     * 一个有效的数独（部分已被填充）不一定是可解的。
     * 只需要根据以上规则，验证已经填入的数字是否有效即可。
     * 给定数独序列只包含数字 1-9 和字符 '.' 。
     * 给定数独永远是 9x9 形式的。
     */
    //使用HashSet
    public boolean isValidSudoku(char[][] board) {
        HashSet[] heng = new HashSet[9];
        HashSet[] shu = new HashSet[9];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = j*3;
                HashSet<Character> nine = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    int y = count/27 * 3;
                    HashSet hashSet = heng[x] == null ? new HashSet<>() : heng[x];
                    for (int l = 0; l < 3; l++) {
                        HashSet hashSet1 = shu[y] == null ? new HashSet<>() : shu[y];
                        char c = board[x][y];
                        if(c != '.'){
                            if(nine.contains(c)) return false;
                            if(hashSet.contains(c)) return false;
                            if(hashSet1.contains(c)) return false;
                            nine.add(c);
                            hashSet.add(c);
                            heng[x] = hashSet;
                            hashSet1.add(c);
                            shu[y] = hashSet1;
                        }
                        //y变化
                        y++;
                        count++;
                    }
                    //x变化
                    x++;
                }
            }
        }
        return true;
    }
    //使用二维数组
    public boolean isValidSudoku2(char[][] board) {
        //行数组
        int[][] rows = new int[9][9];
        //列数组
        int[][] cols = new int[9][9];
        //箱子数组
        int[][] boxs = new int[9][9];
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                char c = board[x][y];
                if(c!='.'){
                    int val = c-'1';
                    int boxIndex = (x/3)*3+y/3;
                    if (rows[x][val]==1) {
                        return false;
                    } else {
                        rows[x][val]=1;
                    }
                    if (cols[y][val]==1) {
                        return false;
                    } else {
                        cols[y][val]=1;
                    }
                    if (boxs[boxIndex][val]==1)  {
                        return false;
                    } else {
                        boxs[boxIndex][val]=1;
                    }
                }
            }
        }
        return true;
    }
}