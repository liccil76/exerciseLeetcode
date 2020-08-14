package findMaxAverage;

public class Main {
    public static void main(String[] args){
        int[] nums = {5};
        int k =1;
        double maxAverage = new Solution().findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }
}