package merge;

public class Main {
    public static void main(String[] args){
        int[] A = {2,0},B={1};
        int m = 1,n = 1;
        new Solution().merge2(A,m,B,n);
        for (int i = 0; i < A.length; i++) {
            System.out.println("A["+i+"]="+A[i]);
        }
    }
}