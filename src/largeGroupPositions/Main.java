package largeGroupPositions;

import java.util.List;

public class Main {
    public static void main(String[] args){
        String S = "abcdddeeeeaabbbcd";
        List<List<Integer>> lists = new Solution().largeGroupPositions(S);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}