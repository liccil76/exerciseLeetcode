package arrayRankTransform;

public class Main {
    public static void main(String[] args){
        int[] arr = {-43};
        int[] ints = new Solution().arrayRankTransform(arr);
        for (int value : ints) {
            System.out.print(value+" ");
        }
    }
}