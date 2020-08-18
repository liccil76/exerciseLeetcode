package decompressRLElist;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,1,2,3};
        int[] ints = new Solution().decompressRLElist(nums);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}