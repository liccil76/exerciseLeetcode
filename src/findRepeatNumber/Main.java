package findRepeatNumber;

public class Main {
    public static void main(String[] args){
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = new Solution().findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }
}