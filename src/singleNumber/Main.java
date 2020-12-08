package singleNumber;

public class Main {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.println(new Solution().singleNumber(nums));

        int[] nums2 = {3,4,3,3};
        System.out.println(new Solution2().singleNumber(nums2));
    }
}