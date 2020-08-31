package containsDuplicate;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        boolean b = new Solution().containsDuplicate(nums);
        System.out.println(b);
    }
}