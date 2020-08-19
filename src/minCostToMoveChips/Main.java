package minCostToMoveChips;

public class Main {
    public static void main(String[] args){
        int[] position = {2,2,2,3,3};
        int i = new Solution().minCostToMoveChips(position);
        System.out.println(i);
    }
}