package matrixReshape;

public class Main {
    public static void main(String[] args){
        int[][] nums = {{1,2},{3,4}};
        int[][] ints = new Solution().matrixReshape(nums, 1, 4);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
}