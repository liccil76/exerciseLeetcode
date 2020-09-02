package plusOne;

public class Main {
    public static void main(String[] args){
        int[] digits = {2,9,9};
        int[] ints = new Solution().plusOne(digits);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}