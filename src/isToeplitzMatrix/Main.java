package isToeplitzMatrix;

public class Main {
    public static void main(String[] args){
        int[][] matrix = {{41,45},{81,41},{73,81},{47,73},{76,47},{79,76}};
        boolean toeplitzMatrix = new Solution().isToeplitzMatrix(matrix);
        System.out.println(toeplitzMatrix);
    }
}