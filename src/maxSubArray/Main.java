package maxSubArray;

public class Main {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = new Solution().maxSubArray(nums);
        System.out.println(i);
    }
}
