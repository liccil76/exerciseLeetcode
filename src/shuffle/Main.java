package shuffle;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] shuffle = new Solution().shuffle(nums, n);
        for (int i : shuffle) {
            System.out.print(i+" ");
        }
    }
}