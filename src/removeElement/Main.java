package removeElement;

public class Main {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        int i = new Solution().removeElement3(nums, val);
        System.out.println(i);
    }
}