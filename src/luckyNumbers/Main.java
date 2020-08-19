package luckyNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> list = new Solution().luckyNumbers(matrix);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}