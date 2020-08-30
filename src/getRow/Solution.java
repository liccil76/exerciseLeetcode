package getRow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 119. 杨辉三角 II
     * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     * 在杨辉三角中，每个数是它左上方和右上方的数的和。
     *
     * 示例:
     * 输入: 3
     * 输出: [1,3,3,1]
     *
     * 进阶：
     * 你可以优化你的算法到 O(k) 空间复杂度吗？
     */
    //递归法
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        if(rowIndex==1){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            return list;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> row = getRow(rowIndex - 1);
        for (int i = 1; i < row.size(); i++) {
            list.add(row.get(i)+row.get(i-1));
        }
        list.add(1);
        return list;
    }
    //找规律法
    public List<Integer> getRow2(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        int numRows = rowIndex + 1;
        for (int index = 0; index < numRows; index++){
            if (index == 0){
                res.add(1);
            }else {
                long eachValOfRow = (long) res.get(index - 1) * (long) (numRows - index) / index;
                res.add((int) eachValOfRow);
            }
        }
        return res;
    }
}
