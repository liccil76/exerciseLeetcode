package isMonotonic;

public class Main {
    public static void main(String[] args){
        int[] A = {1,1,1};
        boolean monotonic = new Solution().isMonotonic(A);
        System.out.println(monotonic);
    }
}