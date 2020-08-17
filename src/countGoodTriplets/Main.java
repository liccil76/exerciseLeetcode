package countGoodTriplets;

public class Main {
    public static void main(String[] args){
        int[] arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        int i = new Solution().countGoodTriplets(arr, a, b, c);
        System.out.println(i);
    }
}