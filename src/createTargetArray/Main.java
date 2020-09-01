package createTargetArray;

public class Main {
    public static void main(String[] args){
        int[] nums = {1};
        int[] index = {0};
        int[] targetArray = new Solution().createTargetArray(nums, index);
        for (int i : targetArray) {
            System.out.print(i+" ");
        }
    }
}