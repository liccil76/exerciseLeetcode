package findShortestSubArray;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,2,3,1,4,2};
        int shortestSubArray = new Solution().findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }
}