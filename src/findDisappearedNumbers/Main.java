package findDisappearedNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers2(nums);
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.print(disappearedNumber+" ");
        }
    }
}