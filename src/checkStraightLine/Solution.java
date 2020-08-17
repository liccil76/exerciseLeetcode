package checkStraightLine;

public class Solution {
    /**
     * 1232. 缀点成线
     * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
     * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
     *
     * 示例 1：
     * 输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
     * 输出：true
     *
     * 示例 2：
     * 输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
     * 输出：false 
     *
     * 提示：
     * 2 <= coordinates.length <= 1000
     * coordinates[i].length == 2
     * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
     * coordinates 中不含重复的点
     */
    public boolean checkStraightLine(int[][] coordinates) {
        //斜线、横线、竖线
        int condition = 1;
        int rate = 0;
        int[] one = coordinates[0];
        int[] two = coordinates[1];
        if(two[0]-one[0]==0) {
            condition=3;//竖线
        }else if(two[1]-one[1]==0) {
            condition=2;//横线
        }else {
            rate = (two[1]-one[1])/(two[0]-one[0]);
        }
        for (int i = 2; i < coordinates.length; i++) {
            if(condition==3) {
                if(coordinates[i][0]-coordinates[i-1][0]!=0) {
                    return false;
                }else{
                    continue;
                }
            }
            if(condition==2) {
                if(coordinates[i][1]-coordinates[i-1][1]!=0){
                    return false;
                }else {
                    continue;
                }
            }
            if(coordinates[i][1]-coordinates[i-1][1]==0 || coordinates[i][0]-coordinates[i-1][0]==0 || (coordinates[i][1]-coordinates[i-1][1])/(coordinates[i][0]-coordinates[i-1][0])!=rate) return false;
        }
        return true;
    }
}