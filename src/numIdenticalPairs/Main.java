package numIdenticalPairs;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,5,3,2,4,2,5,2,2,6,6,2,4,4,5,1,5};
        int i = new Solution().numIdenticalPairs(nums);
        System.out.println(i);
    }
}