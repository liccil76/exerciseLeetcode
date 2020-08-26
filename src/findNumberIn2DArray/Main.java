package findNumberIn2DArray;

public class Main {
    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 15;
        boolean numberIn2DArray = new Solution().findNumberIn2DArray(matrix, target);
        System.out.println(numberIn2DArray);
    }
}