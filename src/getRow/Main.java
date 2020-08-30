package getRow;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int rowIndex = 3;
        List<Integer> row = new Solution().getRow(rowIndex);
        for (Integer integer : row) {
            System.out.print(integer+" ");
        }
    }
}