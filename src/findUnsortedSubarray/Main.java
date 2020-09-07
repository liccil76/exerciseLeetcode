package findUnsortedSubarray;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int unsortedSubarray = new Solution().findUnsortedSubarray(nums);
        System.out.println(unsortedSubarray);
    }
}