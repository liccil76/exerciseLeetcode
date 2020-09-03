package imageSmoother;

public class Main {
    public static void main(String[] args){
        int[][] M = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] ints = new Solution().imageSmoother(M);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}