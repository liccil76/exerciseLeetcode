package pivotIndex;

public class Main {
    public static void main(String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        int i = new Solution().pivotIndex(nums);
        System.out.println(i);
    }
}