package singleNumbers;

public class Main {
    public static void main(String[] args){
        int[] nums = {4,1,4,6};
        int[] ints = new Solution().singleNumbers2(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}