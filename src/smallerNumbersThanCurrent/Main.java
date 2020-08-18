package smallerNumbersThanCurrent;

public class Main {
    public static void main(String[] args){
        int[] nums = {7,7};
        int[] ints = new Solution().smallerNumbersThanCurrent2(nums);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}