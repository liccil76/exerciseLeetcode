package minimumAbsDifference;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> lists = new Solution().minimumAbsDifference(arr);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}