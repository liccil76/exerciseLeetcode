package containsNearbyDuplicate;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean b = new Solution().containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }
}