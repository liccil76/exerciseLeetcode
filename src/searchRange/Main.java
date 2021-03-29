package searchRange;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] ints = new Solution().searchRange(nums, target);
        System.out.println("ints:[" + ints[0] + "," + ints[1] + "]");
    }
}
