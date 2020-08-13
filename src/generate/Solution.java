package generate;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * 在杨辉三角中，每个数是它左上方和右上方的数的和。
     *
     * 示例:
     * 输入: 5
     * 输出:
     * [
     *      [1],
     *     [1,1],
     *    [1,2,1],
     *   [1,3,3,1],
     *  [1,4,6,4,1]
     * ]
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if(numRows<=0) return lists;
        if(numRows==1){
            List<Integer> one = new ArrayList<>();
            one.add(1);
            lists.add(one);
            return lists;
        }
        List<Integer> one = new ArrayList<>();
        one.add(1);
        lists.add(one);
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        lists.add(two);
        List<Integer> tempList;
        List<Integer> list;
        for (int i = 2; i < numRows; i++) {
            list = lists.get(i - 1);
            tempList = new ArrayList<>();
            tempList.add(1);
            for (int i1 = 0; i1 < list.size()-1; i1++) {
                tempList.add(list.get(i1)+list.get(i1+1));
            }
            tempList.add(1);
            lists.add(tempList);
        }
        return lists;
    }
}