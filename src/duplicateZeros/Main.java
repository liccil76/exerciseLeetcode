package duplicateZeros;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        new Solution().duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}