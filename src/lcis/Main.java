package lcis;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,3,5,4,7,8,9,10,11};
        int lengthOfLCIS = new Solution().findLengthOfLCIS(nums);
        System.out.println(lengthOfLCIS);
    }
}
