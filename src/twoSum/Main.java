package twoSum;

public class Main {
    public static void main(String[] args){
        int[] numbers = {-1,0};
        int target = -1;
        int[] ints = new Solution().twoSum(numbers, target);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}