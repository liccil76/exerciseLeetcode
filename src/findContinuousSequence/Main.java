package findContinuousSequence;

public class Main {
    public static void main(String[] args){
        int target = 9;
        int[][] continuousSequence = new Solution().findContinuousSequence(target);
        for (int[] ints : continuousSequence) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}