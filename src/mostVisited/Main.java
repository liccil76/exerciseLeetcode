package mostVisited;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int n = 4;
        int[] rounds = {1,3,1,2};
        List<Integer> list = new Solution().mostVisited2(n, rounds);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}