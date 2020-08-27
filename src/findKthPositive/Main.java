package findKthPositive;

public class Main {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int k=2;
        int kthPositive = new Solution().findKthPositive(arr, k);
        System.out.println(kthPositive);
    }
}