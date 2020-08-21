package findPairs;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,1};
        int k = 1;
        int pairs = new Solution().findPairs(nums, k);
        System.out.println(pairs);
    }
}