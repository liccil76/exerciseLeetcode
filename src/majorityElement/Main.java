package majorityElement;

public class Main {
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        int i = new Solution().majorityElement(nums);
        System.out.println(i);
    }
}