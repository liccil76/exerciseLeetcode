package fairCandySwap;

public class Main {
    public static void main(String[] args){
        int[] A = {1,2,5}, B = {2,4};
        int[] ints = new Solution().fairCandySwap(A, B);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}