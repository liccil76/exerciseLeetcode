package isStraight;

public class Main {
    public static void main(String[] args){
        int[] nums = {0,0,8,5,4};
        boolean straight = new Solution().isStraight(nums);
        System.out.println(straight);
    }
}