package rotate;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        new Solution().rotate3(nums,k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}