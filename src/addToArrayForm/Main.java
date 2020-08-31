package addToArrayForm;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] A = {1,2,0,0};
        int K = 34;
        List<Integer> list = new Solution().addToArrayForm(A, K);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}