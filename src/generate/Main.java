package generate;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<List<Integer>> generate = new Solution().generate(8);
        for (List<Integer> list : generate) {
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}