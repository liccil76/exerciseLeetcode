package prefixesDivBy5;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] A = {1,1,1,0,1};
        List<Boolean> booleans = new Solution().prefixesDivBy5(A);
        for (Boolean aBoolean : booleans) {
            System.out.print(aBoolean+" ");
        }
    }
}