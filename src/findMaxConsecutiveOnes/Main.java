package findMaxConsecutiveOnes;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,0,1,1,0,1};
        int maxConsecutiveOnes = new Solution().findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
}