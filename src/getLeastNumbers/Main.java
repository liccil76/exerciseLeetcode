package getLeastNumbers;

public class Main {
    public static void main(String[] args){
        int[] arr = {0,0,2,3,2,1,1,2,0,4};
        int k = 10;
        int[] leastNumbers = new Solution().getLeastNumbers(arr, k);
        for (int leastNumber : leastNumbers) {
            System.out.println(leastNumber);
        }
    }
}