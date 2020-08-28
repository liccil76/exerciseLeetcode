package runningSum;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] ints = new Solution().runningSum(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}